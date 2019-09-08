package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText user,password;
    String n= "madro", p="123";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void validar(View view){
        user=findViewById(R.id.editTextName);
        password=findViewById(R.id.editTextPassword);

        String nam= user.getText().toString();
        String pas= password.getText().toString();

           if(nam.equals(n) && pas.equals(p)) {
               Intent intent = new Intent(this, FormNewRegister.class);
               startActivity(intent);
           }else{
               Toast.makeText(this,"error, your inconrrect username or password.", Toast.LENGTH_LONG).show();
           }


    }
}
