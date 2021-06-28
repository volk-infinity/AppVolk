package com.example.appvolk.Activity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.appvolk.R;

public class MenuActivity extends AppCompatActivity {

     ImageView imgCadastro,imgContato,imgConsulta,imgMapa,imgSobre;
     Button buttonSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        imgCadastro = findViewById(R.id.imgCadastro);
        imgContato = findViewById(R.id.imgContato);
        imgConsulta = findViewById(R.id.imgConsulta);
        imgMapa = findViewById(R.id.imgMapa);
        imgSobre = findViewById(R.id.imgSobre);
        buttonSair = findViewById(R.id.buttonSair);

        imgCadastro();
        imgContato();
        imgConsulta();
        imgMapa();
        imgSobre();
        buttonSair();

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

    private void buttonSair(){
        buttonSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaLogin = new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(telaLogin);
            }
        });
    }
}