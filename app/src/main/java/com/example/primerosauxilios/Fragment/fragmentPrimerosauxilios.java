package com.example.primerosauxilios.Fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.primerosauxilios.R;
import com.example.primerosauxilios.adaptadores.adapterprimerosauxilios;
import com.example.primerosauxilios.icomunicafragments;
import com.example.primerosauxilios.listaauxilios.firtsauxilios;

import java.util.ArrayList;

public class fragmentPrimerosauxilios extends Fragment {

    adapterprimerosauxilios adapterprimerosauxilios;
    RecyclerView recyclerViewAuxilios;
    ArrayList<firtsauxilios> listaauxilios;
    //referencias para comunicar fragment
    Activity actividad;
    icomunicafragments intefaceComunicaFragments;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.primerosauxilios_fragment, container, false);
        recyclerViewAuxilios = view.findViewById(R.id.recyclerView);
        listaauxilios = new ArrayList<>();
        //cargar la lista
        cargarLista();

        //mostrar los datos
        mostrarDatos();
        return view;
    }
    public void cargarLista(){
        listaauxilios.add(new firtsauxilios("ABC", R.drawable.abc));
        listaauxilios.add(new firtsauxilios("RCP", R.drawable.rcp));
        listaauxilios.add(new firtsauxilios("VENDADO", R.drawable.vendado));
        listaauxilios.add(new firtsauxilios("ASFIXIA", R.drawable.asfixia));
        listaauxilios.add(new firtsauxilios("QUEMADURA", R.drawable.quemaduras));
        listaauxilios.add(new firtsauxilios("AMPOLLAS", R.drawable.ampolla));
        listaauxilios.add(new firtsauxilios("FRACTURAS", R.drawable.fractura));
    }
    public void mostrarDatos(){
        recyclerViewAuxilios.setLayoutManager(new LinearLayoutManager(getContext()));
        adapterprimerosauxilios = new adapterprimerosauxilios(getContext(), listaauxilios);
        recyclerViewAuxilios.setAdapter(adapterprimerosauxilios);
        adapterprimerosauxilios.setOnClickLister(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = listaauxilios.get(recyclerViewAuxilios.getChildAdapterPosition(v)).getNombre();
                Toast.makeText(getContext(), "selecciono: "+nombre, Toast.LENGTH_LONG).show();
                intefaceComunicaFragments.enviarprimerauxilio(listaauxilios.get(recyclerViewAuxilios.getChildAdapterPosition(v)));
            }
        });
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if(context instanceof Activity){
            this.actividad = (Activity) context;
            intefaceComunicaFragments = (icomunicafragments) this.actividad;
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
