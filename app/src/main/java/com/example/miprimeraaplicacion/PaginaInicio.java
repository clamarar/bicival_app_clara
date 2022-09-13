package com.example.miprimeraaplicacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class PaginaInicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_inicio);

        ImageButton BotonBici= findViewById(R.id.BotonBici);
        BotonBici.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Disfrutabici.class);
                startActivityForResult(intent, 0);
                BotonBici.setOnClickListener(this);
            }



        });
        ImageButton BotonAnda= findViewById(R.id.BotonAnda);
        BotonAnda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Disfrutaanda.class);
                startActivityForResult(intent, 0);
            }
        });
        ImageButton BotonCoche= findViewById(R.id.BotonCoche);
        BotonCoche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Disfrutacoche.class);
                startActivityForResult(intent, 0);
            }
        });
        ImageButton BotonPatin= findViewById(R.id.BotonPatin);
        BotonPatin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Disfrutapatin2.class);
                startActivityForResult(intent, 0);
            }
        });
    }
}