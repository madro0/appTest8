package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class FormNewRegister extends AppCompatActivity {

    private EditText ediName;
    private TextView vieName;

    public FormNewRegister() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_new_register);
        ediName= findViewById(R.id.editTextName);

        //vieName=findViewById(R.id.textViewName);
    }
    public void enviar (View view){
        String var = ediName.getText().toString();
        vieName.setText(var);
    }
}
