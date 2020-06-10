package com.example.hernandez_victor_ejerciciosandroid_s5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    ArrayList<Contactos> listacontactos;
    RecyclerView recyclercontactos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maindos);

        listacontactos = new ArrayList<Contactos>();
        llenarcontactos();

        recyclercontactos = (RecyclerView) findViewById(R.id.Recyclerid);
        recyclercontactos.setLayoutManager(new LinearLayoutManager(this));


        AdaptadorContactos adapter = new AdaptadorContactos(listacontactos);
        recyclercontactos.setAdapter(adapter);

    }


    private void llenarcontactos(){

        listacontactos.add(new Contactos("Victor","Descripcion1",R.drawable.imagen));
        listacontactos.add(new Contactos("oel","Descripcion2",R.drawable.imagenuno));

    }
}
