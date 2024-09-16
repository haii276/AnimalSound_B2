package com.example.animalsound;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    int[] images = {R.drawable.togo, R.drawable.penguin};
    String[] texts = {"Togo", "Penguin"};
    int[] colors = {Color.BLUE, Color.GREEN, Color.RED};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m001_act_splash);

        ImageView imageView = findViewById(R.id.imageView);
        TextView textView = findViewById(R.id.textView);
        LinearLayout mainLayout = findViewById(R.id.mainLayout);

        Random random = new Random();
        int randomIndex = random.nextInt(images.length);

        imageView.setImageResource(images[randomIndex]);
        textView.setText(texts[randomIndex]);
        mainLayout.setBackgroundColor(colors[randomIndex]);
    };
}