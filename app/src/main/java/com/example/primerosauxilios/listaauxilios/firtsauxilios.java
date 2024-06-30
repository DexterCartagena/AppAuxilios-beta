package com.example.primerosauxilios.listaauxilios;

import java.io.Serializable;

public class firtsauxilios implements Serializable {
    private String nombre;
    private int imagenid;

    public firtsauxilios(){

    }
    //creamos el constructor
    public firtsauxilios(String nombre, int imagenid) {
        this.nombre = nombre;
        this.imagenid = imagenid;
    }
    //implementamos el metodo get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getImagenid() {
        return imagenid;
    }

    public void setImagenid(int imagenid) {
        this.imagenid = imagenid;
    }
}
