package com.example.recnew;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.*;


public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Button newButton;
    public static ArrayList myTask=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);
        newButton=findViewById(R.id.newButton);

        final Intent intent2 = new Intent(this, AddingTaskActivity.class);
        Button button = this.findViewById(R.id.newButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent2);
            }
        });

        for(int i=0;i<20;i++)
        myTask.add(new Task(i));


        recyclerView.setAdapter(new MyAdapter(this,myTask));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
