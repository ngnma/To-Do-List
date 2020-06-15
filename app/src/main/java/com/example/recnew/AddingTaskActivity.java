package com.example.recnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddingTaskActivity extends AppCompatActivity {
    EditText etTitle, etDescription,etDate;
    String title = "",description = "",date="";
    Button btnAddItem;
    Context context2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adding_task);
        context2=this;
        etTitle = (EditText) findViewById(R.id.etTitle);
        etDescription = (EditText) findViewById(R.id.etDescription);
        etDate=(EditText) findViewById(R.id.etDate);
        btnAddItem = (Button) findViewById(R.id.btnAddItem);
        btnAddItem.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                title = etTitle.getText().toString();
                description = etDescription.getText().toString();
                date=etDate.getText().toString();
                MainActivity.myTask.add(new Task(title,description,date));
                MainActivity.mAdapter.notifyDataSetChanged();
                Intent intent2=new Intent(context2,MainActivity.class);
                startActivity(intent2);

            }

        });
    }


}
