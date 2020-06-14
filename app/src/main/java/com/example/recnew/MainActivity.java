package com.example.recnew;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    String myDataset[]={"asfd","asd","asddf","asfd","asd","asddf","asfd","asd","asddf","asfd","asd","asddf","asfd","asd","asddf","asfd","asd","asddf"};
//    Task myTask[]={new Task(),new Task(),new Task(),new Task(),new Task(),new Task(),new Task(),new Task(),new Task(),new Task(),new Task(),new Task(),new Task(),new Task()};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);

        recyclerView.setAdapter(new MyAdapter(this,myDataset));
//        recyclerView.setAdapter(new MyAdapter(this,myTask));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
