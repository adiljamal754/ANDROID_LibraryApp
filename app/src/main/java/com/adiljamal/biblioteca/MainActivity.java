package com.adiljamal.biblioteca;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.adiljamal.biblioteca.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private ArrayList<Livro> livros = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnGravar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String titulo = binding.tituloEd.getText().toString();
                String  nome = binding.nomeEd.getText().toString();
                Integer ano = Integer.parseInt(binding.anoEd.getText().toString());
                String local = binding.localEd.getText().toString();

                livros.add(new Livro(titulo, nome, ano, local));
                Bundle bundle = new Bundle();
                bundle.putSerializable("livros", livros);
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtras(bundle);
                startActivity(i);
            }




        });
    }
}