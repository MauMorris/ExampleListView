package com.example.mauriciogodinez.listview;

// Created by mauriciogodinez on 27/09/15.

public class Ninjas {
    private int imagen;
    private String nombre;
    private int imagen2;

    public Ninjas(int imagen, int imagen2, String nombre) {
        super();
        this.imagen = imagen;
        this.imagen2 = imagen2;
        this.nombre = nombre;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public int getImagen2() {
        return imagen2;
    }

    public void setImagen2(int imagen2) {
        this.imagen2 = imagen2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
