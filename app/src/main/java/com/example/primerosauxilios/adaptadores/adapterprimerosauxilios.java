package com.example.primerosauxilios.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.primerosauxilios.R;
import com.example.primerosauxilios.listaauxilios.firtsauxilios;

import java.util.ArrayList;

public class adapterprimerosauxilios extends RecyclerView.Adapter<adapterprimerosauxilios.ViewHolder> implements View.OnClickListener{
    //aqui cargamos toda la lista de los primeros auxilios
    LayoutInflater inflater;
    ArrayList<firtsauxilios> model;

    //Listener
    private View.OnClickListener listener;
    public adapterprimerosauxilios(Context context, ArrayList<firtsauxilios>model){
        this.inflater = LayoutInflater.from(context);
        this.model = model;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.lista_primerosauxilios, parent, false);
        view.setOnClickListener(this);
        return new ViewHolder(view);
    }

    public void setOnClickLister(View.OnClickListener listener){
        this.listener = listener;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String nombre = model.get(position).getNombre();
        int imagen = model.get(position).getImagenid();
        holder.nombres.setText(nombre);
        holder.imagen.setImageResource(imagen);
    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    @Override
    public void onClick(View v) {
        if(listener!=null){
            listener.onClick(v);
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView nombres;
        ImageView imagen;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nombres = itemView.findViewById(R.id.textviewAabc);
            imagen = itemView.findViewById(R.id.imagen_auxilio1);
        }
    }
}
