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

public class fragmenthospitales extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.hospitales_fragment, container, false);

        Button btnOpenLink = view.findViewById(R.id.btn_ubi_hospitaljapones);
        btnOpenLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Hospital+Japon%C3%A9s+de+Tercer+Nivel/@-17.773285,-63.1575558,17z/data=!3m1!4b1!4m6!3m5!1s0x93f1e880643cf075:0xa41e13d2a813203!8m2!3d-17.7732901!4d-63.1549809!16s%2Fg%2F1vcq8pg_?entry=ttu";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        Button btnjuandios = view.findViewById(R.id.btn_ubi_sjdios);
        btnjuandios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Hospital+San+Juan+De+Dios/@-17.7792328,-63.1902701,16z/data=!4m6!3m5!1s0x93f1e809666e28d9:0xc531e6b6529e39e4!8m2!3d-17.7787526!4d-63.185953!16s%2Fg%2F11c1hjg335?entry=ttu";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        Button btnobrero = view.findViewById(R.id.btn_ubi_hospitalobrero);
        btnobrero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Hospital+Obrero+N%C2%B0+3/@-17.7673068,-63.1613507,16.5z/data=!4m6!3m5!1s0x93f1e7d4954beaed:0xe351885f4fa08f8a!8m2!3d-17.7670686!4d-63.1577314!16s%2Fg%2F1tgw6390?entry=ttu";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        Button btnincor = view.findViewById(R.id.btn_ubi_incor);
        btnincor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Cl%C3%ADnica+Incor/@-17.7880294,-63.1977849,17z/data=!3m1!4b1!4m6!3m5!1s0x93f1e81b320359e5:0x9ad5a55e46b93e0a!8m2!3d-17.7880345!4d-63.19521!16s%2Fg%2F1tddt8nv?entry=ttu";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        Button btnfoianini = view.findViewById(R.id.btn_ubi_foianini);
        btnfoianini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Cl%C3%ADnica+Foianini/@-17.7921965,-63.1838347,16.25z/data=!4m6!3m5!1s0x93f1e814ad898267:0xf68470bd3f91d8ce!8m2!3d-17.7913414!4d-63.1798846!16s%2Fg%2F1hjh0jrsf?entry=ttu";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        Button btnsanpedro = view.findViewById(R.id.btn_ubi_sanpedro);
        btnsanpedro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Clinica+San+Pedro/@-17.8154553,-63.2048807,14.5z/data=!4m6!3m5!1s0x93f1e82e2e780723:0x3dc40ca89f38243!8m2!3d-17.8122021!4d-63.1917637!16s%2Fg%2F11d_d9yym8?entry=ttu";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        return view;
    }
}
