package com.example.appvolk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MenuActivity extends AppCompatActivity {
ImageView imgCadastro,imgContato,imgConsulta,imgMapa,imgSobre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        imgCadastro = findViewById(R.id.imgCadastro);
        imgContato = findViewById(R.id.imgContato);
        imgConsulta = findViewById(R.id.imgConsulta);
        imgMapa = findViewById(R.id.imgMapa);
        imgSobre = findViewById(R.id.imgSobre);

        imgCadastro();
        imgContato();
        imgConsulta();
        imgMapa();
        imgSobre();

    }

    private void imgCadastro(){
        imgCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),CadastrarActivity.class);
                startActivity(intent);
            }
        });
    }

    private void imgContato(){
        imgContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ContatoActivity.class);
                startActivity(intent);
            }
        });
    }

    private void imgConsulta(){
        imgConsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ConsultarActivity.class);
                startActivity(intent);
            }
        });
    }

    private void imgMapa(){
        imgMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MapaActivity.class);
                startActivity(intent);
            }
        });
    }

    private void imgSobre(){
        imgSobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SobreActivity.class);
                startActivity(intent);
            }
        });
    }

}