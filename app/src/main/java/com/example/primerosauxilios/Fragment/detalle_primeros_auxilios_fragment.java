package com.example.primerosauxilios.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.primerosauxilios.R;
import com.example.primerosauxilios.listaauxilios.firtsauxilios;

public class detalle_primeros_auxilios_fragment extends Fragment{
    TextView nombreDetalle;
    ImageView imagenDetalle;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.detalle_primerauxilio_fragment, container, false);
        nombreDetalle = view.findViewById(R.id.detalle_pa);
        imagenDetalle = view.findViewById(R.id.imagen_pa);
        //crear objeto bundle para recibir el objeto enviado por argumentos
        Bundle objetoPersona = getArguments();
        firtsauxilios firtsauxilios = null;
        //validacion para verificar si existen argumentos enviados para mostrar
        if(objetoPersona!=null){
            firtsauxilios = (com.example.primerosauxilios.listaauxilios.firtsauxilios) objetoPersona.getSerializable("objeto");
            //establecer los datos en las vistas
            nombreDetalle.setText(firtsauxilios.getNombre());
            imagenDetalle.setImageResource(firtsauxilios.getImagenid());
        }
        return view;
    }
}
