package com.example.countryprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class InformationActiviy extends AppCompatActivity {

    private ImageView image;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_activiy);

        image = findViewById(R.id.image_country);
        text = findViewById(R.id.text_country);

        Bundle bundle = getIntent().getExtras();

        if(bundle!=null){
            String countryName = bundle.getString("name");
            show_details(countryName);
        }


    }

    void show_details(String country_name){
        if(country_name.equals("bangladesh")){
            image.setImageResource(R.drawable.dhaka);
            text.setText(R.string.bangladesh);
        }
        else if(country_name.equals("india")){
            image.setImageResource(R.drawable.agra);
            text.setText(R.string.india);
        }
        else if(country_name.equals("pakistan")){
            image.setImageResource(R.drawable.islamabad);
            text.setText(R.string.pakistan);
        }

    }
}