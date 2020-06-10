package com.example.hernandez_victor_ejerciciosandroid_s5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AdaptadorContactos extends RecyclerView.Adapter<AdaptadorContactos.ViewHolderContactos> {

    ArrayList<Contactos> contactos;

    public AdaptadorContactos(){}
    public AdaptadorContactos(ArrayList<Contactos> contactos) {
        this.contactos = contactos;
    }

    @NonNull
    @Override
    public ViewHolderContactos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_contactos,null,false);
        return new ViewHolderContactos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderContactos holder, int position) {

        holder.etiNombre.setText(contactos.get(position).getNombre());
        holder.etiInformacion.setText(contactos.get(position).getInfo());
        holder.foto.setImageResource(contactos.get(position).getFoto());

    }

    @Override
    public int getItemCount() {
        return contactos.size();
    }

    public class ViewHolderContactos extends RecyclerView.ViewHolder {

        TextView etiNombre,etiInformacion;
        ImageView foto;


        public ViewHolderContactos(@NonNull View itemView) {
            super(itemView);

            etiNombre = (TextView) itemView.findViewById(R.id.idNombre);
            etiInformacion = (TextView) itemView.findViewById(R.id.idInfo);
            foto = (ImageView) itemView.findViewById(R.id.idImagen);


        }
    }
}
