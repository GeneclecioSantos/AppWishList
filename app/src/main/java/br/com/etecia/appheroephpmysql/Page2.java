package br.com.etecia.appheroephpmysql;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Page2 extends AppCompatActivity {

    Button buttonBack;
    ImageView imgMercado;

    ImageView imgFarmacia;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        buttonBack = findViewById(R.id.buttonBack);
        imgMercado = findViewById(R.id.imgMercado);
        imgFarmacia =findViewById(R.id.imgFarmacia);

        imgMercado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), mercado.class);
                startActivity(intent);

            }
        });

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);

            }
        });

        imgFarmacia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), farmacia.class);
                startActivity(intent);
            }
        });

    }
}