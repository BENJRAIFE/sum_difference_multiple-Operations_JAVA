package com.example.exercices_3_operations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button Somme;
    Button difference;
    Button  produit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Somme=(Button) findViewById(R.id.sommeBtn);
        difference=(Button) findViewById(R.id.differenceBtn);
        produit=(Button) findViewById(R.id.produitBtn);

        Somme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(getApplicationContext(), MainActivity2.class));
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("operation","somme");
                startActivity(intent);
            }
        });
        difference.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(getApplicationContext(), MainActivity2.class));
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("operation","difference");
                startActivity(intent);
            }
        });
        produit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(getApplicationContext(), MainActivity2.class));
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("operation","produit");
                startActivity(intent);
            }
        });
    }
}