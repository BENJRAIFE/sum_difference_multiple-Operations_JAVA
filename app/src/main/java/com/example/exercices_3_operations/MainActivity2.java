package com.example.exercices_3_operations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity2 extends AppCompatActivity {

    Button result;
    Button retour;
    TextInputEditText premier;
    TextInputEditText deusieme;
    TextView textOperation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textOperation=(TextView) findViewById(R.id.textOp);
        result=(Button) findViewById(R.id.ResultBtn);
        retour=(Button) findViewById(R.id.retourBtn);
        premier=(TextInputEditText) findViewById(R.id.firstInput);
        deusieme=(TextInputEditText) findViewById(R.id.secondInput);

        // getting the information from the first activity
        Bundle bandle=getIntent().getExtras();

        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity2.this,MainActivity.class);
                startActivity(intent);
            }
        });
        switch (bandle.getString("operation")){
            case "somme":
                textOperation.setText("+");
                result.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double firstNb=Double.parseDouble(premier.getText().toString());
                        double secondNb=Double.parseDouble(deusieme.getText().toString());
                        double sum=firstNb+secondNb;
                        Toast.makeText(MainActivity2.this, " "+sum, Toast.LENGTH_SHORT).show();

                    }
                });
                break;
            case "difference":
                textOperation.setText("-");
                result.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double firstNb=Double.parseDouble(premier.getText().toString());
                        double secondNb=Double.parseDouble(deusieme.getText().toString());

                        double dif=firstNb-secondNb;
                        Toast.makeText(MainActivity2.this, " "+dif, Toast.LENGTH_SHORT).show();
                    }
                });
                break;
            case "produit":
                textOperation.setText("x");
                result.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double firstNb=Double.parseDouble(premier.getText().toString());
                        double secondNb=Double.parseDouble(deusieme.getText().toString());
                        double produit=firstNb*secondNb;
                        Toast.makeText(MainActivity2.this,""+ produit, Toast.LENGTH_SHORT).show();
                    }
                });
                break;
        }
    }
}