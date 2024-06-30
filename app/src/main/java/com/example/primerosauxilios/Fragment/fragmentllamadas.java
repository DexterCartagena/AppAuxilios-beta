package com.example.primerosauxilios.Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


import com.example.primerosauxilios.R;

public class fragmentllamadas extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.llamadas_fragment, container, false);

        Button btnEmergencia = view.findViewById(R.id.btn_emergencia);
        btnEmergencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:911"));
                startActivity(intent);
            }
        });

        Button btnRadiopatrulla = view.findViewById(R.id.btn_radiopatrulla);
        btnRadiopatrulla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:110"));
                startActivity(intent);
            }
        });

        Button btnAuma = view.findViewById(R.id.btn_A_uma);
        btnAuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:67899920"));
                startActivity(intent);
            }
        });

        Button btnAsamed = view.findViewById(R.id.btn_A_samed);
        btnAsamed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:72105000"));
                startActivity(intent);
            }
        });

        Button btnAciem = view.findViewById(R.id.btn_A_ciem);
        btnAciem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:60973691"));
                startActivity(intent);
            }
        });

        Button btnhospitaljapones = view.findViewById(R.id.btn_hospitaljapones);
        btnhospitaljapones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:33462031"));
                startActivity(intent);
            }
        });

        Button btnJuan = view.findViewById(R.id.btn_sjdedios);
        btnJuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:33352866"));
                startActivity(intent);
            }
        });

        Button btnincor = view.findViewById(R.id.btn_clinicaincor);
        btnincor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:33520444"));
                startActivity(intent);
            }
        });

        return view;
    }
}


