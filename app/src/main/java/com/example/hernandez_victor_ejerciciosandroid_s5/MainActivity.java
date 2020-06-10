package com.example.hernandez_victor_ejerciciosandroid_s5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
//import androidx.recyclerview.widget.GridLayoutManager;
//import androidx.recyclerview.widget.LinearLayoutManager;
//import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {




    EditText campo1, campo2;
    Button btnlimpiar, btnentrar;
    String user = "", pass="";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campo1 = (EditText) findViewById(R.id.editText1);
        campo2 = (EditText) findViewById(R.id.editText2);

    }


    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.btnentrar: entrar();
                break;

            case R.id.btnlimpiar: limpiar();
                break;
        }

    }

    private void limpiar() {

        campo1.setText("");
        campo2.setText("");
    }

    private void entrar() {

        user = campo1.getText().toString();
        pass = campo2.getText().toString();

        if (user.equals("admin")  & pass.equals("1234"))
        {
            Toast.makeText(this, "ingresando", Toast.LENGTH_LONG).show();
            startActivity(new Intent(MainActivity.this, Main2Activity.class));

        }
        else
        {
            Toast.makeText(this, "Los credenciales son incorrectos", Toast.LENGTH_LONG).show();
        }


    }


}
