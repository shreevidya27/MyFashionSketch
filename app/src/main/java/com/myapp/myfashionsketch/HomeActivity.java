package com.myapp.myfashionsketch;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageview3;
    ImageView imageView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageview3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);

        imageView1.setOnClickListener(this::onClick_1);
        imageView2.setOnClickListener(this::onClick_2);
        imageview3.setOnClickListener(this::onClick_3);
        imageView4.setOnClickListener(this::onClick_4);
    }

    private void onClick_1(View view) {
        Intent mainIntent = new Intent(getApplicationContext(),
                DetailedActivity.class);
        startActivity(mainIntent);
    }

    private void onClick_2(View view) {
        Intent mainIntent = new Intent(getApplicationContext(),
                BottomDetailedActivity.class);
        startActivity(mainIntent);
    }

    private void onClick_3(View view) {
        Intent mainIntent = new Intent(getApplicationContext(),
                BackNeckDetailedActivity.class);
        startActivity(mainIntent);
    }

    private void onClick_4(View view) {
        Intent mainIntent = new Intent(getApplicationContext(),
                DetailedNeckActivity.class);
        startActivity(mainIntent);
    }

}