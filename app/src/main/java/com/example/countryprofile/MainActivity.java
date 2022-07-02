package com.example.countryprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bd_btn, ind_btn, pak_btn;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bd_btn = findViewById(R.id.bd_btn);
        ind_btn = findViewById(R.id.india_btn);
        pak_btn = findViewById(R.id.pak_btn);

        bd_btn.setOnClickListener(this);
        ind_btn.setOnClickListener(this);
        pak_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        if(v.getId() == R.id.bd_btn){
            intent = new Intent(MainActivity.this, InformationActiviy.class);
            intent.putExtra("name", "bangladesh");
            startActivity(intent);
        }

        else if(v.getId() == R.id.india_btn){
            intent = new Intent(MainActivity.this, InformationActiviy.class);
            intent.putExtra("name", "india");
            startActivity(intent);
        }

        else if(v.getId() == R.id.pak_btn){
            intent = new Intent(MainActivity.this, InformationActiviy.class);
            intent.putExtra("name", "pakistan");
            startActivity(intent);
        }

    }
}