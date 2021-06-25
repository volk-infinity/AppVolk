package com.example.appvolk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    Button buttonEntrar;
    TextView textNãoPossuiConta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        buttonEntrar = findViewById(R.id.buttonEntrar);
        textNãoPossuiConta = findViewById(R.id.textNãoPossuiConta);

        buttonEntrar();
        textNãoPossuiConta();

    }

        private void buttonEntrar(){
            buttonEntrar.setOnClickListener(new View.OnClickListener() {
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
