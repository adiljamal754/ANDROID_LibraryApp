package com.adiljamal.biblioteca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.adiljamal.biblioteca.databinding.ActivitySecondBinding;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    private ActivitySecondBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Bundle bundle = getIntent().getExtras();
        ArrayList<Livro>  livros = (ArrayList<Livro>) bundle.getSerializable("livros");

        for (Livro l: livros) {
            System.out.println("Id:" + l.getId() +
                    "Titulo:" + l.getTitulo() +
                    "Nome do Autor:" + l.getNomeAutor() +
                    "Ano de Lançamento:" + l.getAno() +
                    "Local de edição:" + l.getLocalEd());
        }

        binding.btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                voltarTela();
            }
        });


    }
    public void voltarTela(){
        this.finish();
    }
}