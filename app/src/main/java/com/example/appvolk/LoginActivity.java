package com.example.appvolk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    Button buttonEnviar;
    TextView textNãoPossuiConta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        buttonEnviar = findViewById(R.id.buttonEnviar);
        textNãoPossuiConta = findViewById(R.id.textNãoPossuiConta);

        buttonEnviar();
        textNãoPossuiConta();

    }

        private void buttonEnviar(){
            buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaMenu = new Intent(getApplicationContext(),MenuActivity.class);
                startActivity(telaMenu);
            }
        });

    }

        private void textNãoPossuiConta(){
            textNãoPossuiConta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),CadastroSocioActivity.class);
                startActivity(intent);
            }
        });
    }

}
