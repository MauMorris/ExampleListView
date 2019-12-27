package com.example.mauriciogodinez.listview;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

 // Created by mauriciogodinez on 27/09/15.

public class NinjasAdapter extends ArrayAdapter <Ninjas> {
    private Context context;
    private int layoutResourceId;
    private Ninjas[] datos;

    public NinjasAdapter(Context context, int layoutResourceId, Ninjas[] datos) {
        super(context, layoutResourceId, datos);

        this.context = context;
        this.layoutResourceId = layoutResourceId;
        this.datos = datos;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent){

        Ninjas ninjas = datos[position];
        View renglon = convertView;

        NinjasHolder holder = new NinjasHolder();

        if(renglon == null){
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            renglon = inflater.inflate(layoutResourceId, parent, false);

            holder.setImagen((ImageView) renglon.findViewById(R.id.iv_1));
            holder.setImagen2((ImageView) renglon.findViewById(R.id.iv_11));
            holder.setNombre((TextView) renglon.findViewById(R.id.tv_1));

            renglon.setTag(holder);
        }
        else{
            holder = (NinjasHolder) renglon.getTag();
        }

        holder.getImagen().setImageResource(ninjas.getImagen());
        holder.getImagen2().setImageResource(ninjas.getImagen2());
        holder.getNombre().setText(ninjas.getNombre());

        return renglon;
    }
}
