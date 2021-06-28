package com.example.appvolk.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.example.appvolk.R;

public class ConsultarActivity extends AppCompatActivity {
    ImageView imgSocio,imgClientes,imgAtividades;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar);
        imgSocio = findViewById(R.id.imgSocio);
        imgClientes = findViewById(R.id.imgClientes);
        imgAtividades = findViewById(R.id.imgAtividades);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        imgSocio();
        imgClientes();
        imgAtividades();
    }

    private void imgSocio(){
        imgSocio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ConsultaSocioActivity.class);
                startActivity(intent);
            }
        });
    }

    private void imgClientes(){
        imgClientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ConsultaClientesActivity.class);
                startActivity(intent);
            }
        });
    }

    private void imgAtividades(){
        imgAtividades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ConsultaAtividadesActivity.class);
                startActivity(intent);
            }
        });
    }

    public boolean onOptionsItemSelected(MenuItem menuItem){

        switch (menuItem.getItemId()){
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

}