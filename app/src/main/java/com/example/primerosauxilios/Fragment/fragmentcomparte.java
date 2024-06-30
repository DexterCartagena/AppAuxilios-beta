package com.example.primerosauxilios.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.primerosauxilios.R;

public class fragmentcomparte extends Fragment {

    Button btncompatir;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.comparte_fragment, container, false);
        //return view;
        btncompatir = (Button) view.findViewById(R.id.btn_compartir);
        btncompatir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT, "https://drive.google.com/drive/u/0/folders/1DDCsU4C_vELiDeSadY_niuH64bCvT4nS");
                intent.setType("text/plain");
                startActivity(Intent.createChooser(intent, "Compartir con:"));
            }
        });
        return view;
    }
}
