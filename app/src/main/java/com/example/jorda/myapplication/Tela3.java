package com.example.jorda.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Tela3 extends AppCompatActivity {

    private String mensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);
    }

    public void abrirTela2 (View v){
        Intent tela = new Intent(this, Tela2.class);
        tela.putExtra("Mensagem",mensagem);
        startActivity(tela);
    }
}
