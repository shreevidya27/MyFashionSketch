package com.myapp.myfashionsketch;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageview3;
    ImageView imageView4;
    public static final String EXTRA_MESSAGE = "com.example.fashion.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageview3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);

        imageView1.setOnClickListener(this::onClick);
        imageView2.setOnClickListener(this::onClick);
        imageview3.setOnClickListener(this::onClick);
        imageView4.setOnClickListener(this::onClick);
    }

    private void onClick(View view) {
        Intent mainIntent = new Intent(getApplicationContext(),
                DetailedActivity.class);
        startActivity(mainIntent);
    }
}