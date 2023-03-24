package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class SplashActivity extends AppCompatActivity {
    // Declarando o Objeto botão
    Button btnAbrirLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_layout);
        // Apresentando o XML para o Java
        btnAbrirLogin = findViewById(R.id.btnAbrirLogin);

        // Criar a ação de clique do botão

    }
}