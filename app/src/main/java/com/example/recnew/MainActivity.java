package com.example.recnew;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    public static ArrayList myTask=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);

        for(int i=0;i<20;i++)
        myTask.add(new Task(i));

        recyclerView.setAdapter(new MyAdapter(this,myTask));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
