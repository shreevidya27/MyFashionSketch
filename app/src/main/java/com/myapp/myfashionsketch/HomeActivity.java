package com.myapp.myfashionsketch;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.myapp.myfashionsketch.R.layout;
import com.myapp.myfashionsketch.adapter.HorizontalAdapter;

import java.util.List;

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