package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.RecycleView);

        List<Contatos> listContatos = new ArrayList<>();

        Contatos Neymar = new Contatos();
        Neymar.setNome("Neymar Silicone");
        Neymar.setTelefone("+5511988387640");

        Contatos Ronaldo = new Contatos();
        Ronaldo.setNome("Ronaldo Feromonio");
        Ronaldo.setTelefone("+5511988670619");

        Contatos Marta = new Contatos();
        Marta.setNome("Marta suplucy");
        Marta.setTelefone("+5511988528867");

        listContatos.add(Neymar);
        listContatos.add(Ronaldo);
        listContatos.add(Marta);

        recyclerView.setAdapter(new AdapterListContatos(listContatos, this));

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(layoutManager);

    }
}



