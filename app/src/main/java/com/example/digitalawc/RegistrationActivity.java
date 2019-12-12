package com.example.digitalawc;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;


public class RegistrationActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.select_user_type, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        //user category

        Spinner spinnercat = (Spinner) findViewById(R.id.spinner_cat);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adaptercat = ArrayAdapter
                .createFromResource(this, R.array.select_user_category, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adaptercat.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnercat.setAdapter(adaptercat);

    }
    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    EditText et1=findViewById(R.id.et_mobile);*/



    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();
        EditText adminid=(EditText)findViewById(R.id.et_admin_id);
        Spinner spin=(Spinner)findViewById(R.id.spinner_cat);
        if (item.equals("Anganwadi Admin")){
            adminid.setVisibility(View.VISIBLE);
            spin.setEnabled(false);

        }else {
            adminid.setVisibility(View.INVISIBLE);
            spin.setEnabled(true);
        }

    }
    public void processSignInLinkClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void processRegistrationUserBtnClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }}



