package com.example.appvolk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CadastrarActivity extends AppCompatActivity {
ImageView imgSocio,imgClientes,imgAtividades;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar);
        imgSocio = findViewById(R.id.imgSocio);
        imgClientes = findViewById(R.id.imgClientes);
        imgAtividades = findViewById(R.id.imgAtividades);

        imgSocio();
        imgClientes();
        imgAtividades();

    }

    private void imgSocio(){
        imgSocio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),CadastroSocioActivity.class);
                startActivity(intent);
            }
        });

    }

    private void imgClientes(){
        imgClientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),CadastroClienteActivity.class);
                startActivity(intent);
            }
        });
    }

    private void imgAtividades(){
        imgAtividades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),CadastroAtividadesActivity.class);
                startActivity(intent);
            }
        });
    }

}