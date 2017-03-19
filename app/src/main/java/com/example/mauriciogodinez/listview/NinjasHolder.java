package com.example.mauriciogodinez.listview;

import android.widget.ImageView;
import android.widget.TextView;

 // Created by mauriciogodinez on 27/09/15.

public class NinjasHolder {

    private ImageView imagen;
    private ImageView imagen2;
    private TextView nombre;

    public NinjasHolder() {
    }

    public ImageView getImagen() {
        return imagen;
    }

    public ImageView getImagen2() {
        return imagen2;
    }

    public TextView getNombre() {
        return nombre;
    }

    public void setImagen(ImageView imagen) {
        this.imagen = imagen;
    }

    public void setImagen2(ImageView imagen2) {
        this.imagen2 = imagen2;
    }

    public void setNombre(TextView nombre) {
        this.nombre = nombre;
    }
}