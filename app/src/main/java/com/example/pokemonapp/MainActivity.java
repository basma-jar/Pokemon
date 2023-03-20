package com.example.pokemonapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView image1;
    private CardView card1;
    private ImageView image2;
    private CardView card2;
    private ImageView image3;
    private ImageView image4;
    private ImageView image5;
    private ImageView image6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image1 =findViewById(R.id.img1);
        image2=findViewById(R.id.img2);
        image3=findViewById(R.id.img3);
        image4=findViewById(R.id.img4);
        image5=findViewById(R.id.img5);
        image6=findViewById(R.id.img6);
        card1 =findViewById(R.id.card1);
        card2=findViewById(R.id.card2);
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCaterpie();
            }
        });
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCaterpie();
            }
        });

        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCharmeleon();
            }
        });
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCharmeleon();
            }
        });
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEkans();
            }
        });
        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openJigglypuff();
            }
        });
        image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPikachu();
            }
        });
        image6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSquirtle();
            }
        });

    }

    public void openCaterpie()
    {
    Intent intent1=new Intent(MainActivity.this,Caterpie.class);
    startActivity(intent1);
    }

    public void openCharmeleon()
    {
        Intent intent1=new Intent(MainActivity.this,Charmeleo.class);
        startActivity(intent1);
    }

    public void openEkans()
    {
        Intent intent1=new Intent(MainActivity.this,Ekans.class);
        startActivity(intent1);
    }

    public void openJigglypuff()
    {
        Intent intent1=new Intent(MainActivity.this,Jigglypuff.class);
        startActivity(intent1);
    }

    public void openPikachu()
    {
        Intent intent1=new Intent(MainActivity.this,Pikachu.class);
        startActivity(intent1);
    }

    public void openSquirtle()
    {
        Intent intent1=new Intent(MainActivity.this,Squirtle.class);
        startActivity(intent1);
    }

}