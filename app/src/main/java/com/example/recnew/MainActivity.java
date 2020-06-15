package com.example.recnew;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.*;


public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Button newbtn;
    public static MyAdapter mAdapter;
    public static ArrayList<Task> myTask=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        newbtn=findViewById(R.id.newbtn);

        final Intent intent2 = new Intent(this, AddingTaskActivity.class);
        newbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent2);
            }
        });

        mAdapter=new MyAdapter(this);
        recyclerView.setAdapter(mAdapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
