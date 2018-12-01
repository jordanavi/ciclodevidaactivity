package com.example.jorda.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Tela2 extends AppCompatActivity {

    private String mensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
    }

    public void abrirTela3 (View v){
        Intent tela = new Intent(this, Tela3.class);
        tela.putExtra("Mensagem",mensagem);
        startActivity(tela);
    }

    public void abrirTela1 (View v){
        Intent tela = new Intent(this, MainActivity.class);
        tela.putExtra("Mensagem",mensagem);
        startActivity(tela);
    }
}
