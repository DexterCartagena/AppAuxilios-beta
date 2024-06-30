package com.example.primerosauxilios;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.primerosauxilios.Fragment.acercadefragment;
import com.example.primerosauxilios.Fragment.detalle_primeros_auxilios_fragment;
import com.example.primerosauxilios.Fragment.fragmentPrimerosauxilios;
import com.example.primerosauxilios.Fragment.fragmentcomparte;
import com.example.primerosauxilios.Fragment.fragmenthospitales;
import com.example.primerosauxilios.Fragment.fragmentkitdomestico;
import com.example.primerosauxilios.Fragment.fragmentllamadas;
import com.example.primerosauxilios.Fragment.mainFragment;
import com.example.primerosauxilios.listaauxilios.firtsauxilios;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, icomunicafragments{

    //variables para que se muestre el menu
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar;
    NavigationView navigationView;

    //variable para cargar el fragment principal
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    //variable del fragment detalle_primeros_auxilios
    detalle_primeros_auxilios_fragment detallePrimerosAuxiliosFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawerLayout = findViewById(R.id.drawer);
        navigationView = findViewById(R.id.navegationview);
        //establecer evento Onclick al navegation View
        navigationView.setNavigationItemSelectedListener(this);


        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout,toolbar,R.string.open, R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.setDrawerIndicatorEnabled(true);
        actionBarDrawerToggle.syncState();

        //cargar fragment principal
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.container, new mainFragment());
        fragmentTransaction.commit();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        drawerLayout.closeDrawer(GravityCompat.START);
        //si el item es igual al item Guias y consejos que me lo cargue el fragment
        if(item.getItemId() == R.id.consejosyguia){
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container, new mainFragment());
            fragmentTransaction.commit();
        }
        if(item.getItemId() == R.id.medicalservice){
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container, new fragmentPrimerosauxilios());
            fragmentTransaction.commit();
        }
        if(item.getItemId() == R.id.kitdomestico){
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container, new fragmentkitdomestico());
            fragmentTransaction.commit();
        }
        if(item.getItemId() == R.id.googlemap){
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container, new fragmenthospitales());
            fragmentTransaction.commit();
        }
        if(item.getItemId() == R.id.llamadas){
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container, new fragmentllamadas());
            fragmentTransaction.commit();
        }
        if(item.getItemId() == R.id.comparte){
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container, new fragmentcomparte());
            fragmentTransaction.commit();
        }
        if(item.getItemId() == R.id.acercade){
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container, new acercadefragment());
            fragmentTransaction.commit();
        }
        return false;
    }

    @Override
    public void enviarprimerauxilio(firtsauxilios firtsauxilios) {
        //aqui se realiza toda la logica para necesaria para poder realizar el envio
        detallePrimerosAuxiliosFragment = new detalle_primeros_auxilios_fragment();
        //objeto bundle para transportar la informacion
        Bundle bundleEnvio = new Bundle();
        //enviar el objeto que esta llegando con Serializable
        bundleEnvio .putSerializable("objeto", firtsauxilios);
        detallePrimerosAuxiliosFragment.setArguments(bundleEnvio);
        //abrir fragment
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container, detallePrimerosAuxiliosFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }
}