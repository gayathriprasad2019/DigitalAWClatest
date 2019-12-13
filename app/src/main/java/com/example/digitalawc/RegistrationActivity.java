package com.example.digitalawc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.digitalawc.pojo.RegisterRequest;
import com.example.digitalawc.pojo.RegisterResponse;
import com.example.digitalawc.ws.APIServices;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        Spinner spinner = findViewById(R.id.spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.select_user_type, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        //user category

        Spinner spinnercat = findViewById(R.id.spinner_cat);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adaptercat = ArrayAdapter
                .createFromResource(this, R.array.select_user_category, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adaptercat.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnercat.setAdapter(adaptercat);
    }

    public void processSignInLinkClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void processRegistrationUserBtnClick(View view) {
        final EditText et_name = findViewById(R.id.et_reg_name);
        final EditText et_email = findViewById(R.id.et_reg_email);
        final EditText et_password = findViewById(R.id.et_reg_password);
        final EditText et_address = findViewById(R.id.et_reg_address);
        //final Spinner spin_category = findViewById(R.id.spinner_cat);

        // Retrieve Field Values
        String name = et_name.getText().toString();
        String email = et_email.getText().toString();
        String password = et_password.getText().toString();
        String address = et_address.getText().toString();
        //String category = spin_category.getOnItemSelectedListener().toString();

        RegisterRequest registerRequest = new RegisterRequest();
        registerRequest.setName(name);
        registerRequest.setEmail(email);
        registerRequest.setPassword(password);
        registerRequest.setAddress(address);
        //registerRequest.setCategory(category);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.48.35/Anganwadi/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        APIServices services = retrofit.create(APIServices.class);
        Call<RegisterResponse> call = services.register(registerRequest);
        call.enqueue(new Callback<RegisterResponse>() {
            @Override
            public void onResponse(Call<RegisterResponse> call, Response<RegisterResponse> response) {
                if (response.body()!=null&&response.body().isStatus()){
                    Toast.makeText(getApplicationContext(), "Registration Successful!!!",Toast.LENGTH_LONG)
                            .show();
                    Intent intent = new Intent(getApplicationContext(), DisplayCredentials.class);
                    startActivity(intent);
            }}

            @Override
            public void onFailure(Call<RegisterResponse> call, Throwable t) {
                //Toast.makeText(getApplicationContext(), t.getMessage(),Toast.LENGTH_LONG)
                Toast.makeText(getApplicationContext(), "Message"+t.getMessage(),Toast.LENGTH_LONG)
                        .show();
            }
        });
    }
}