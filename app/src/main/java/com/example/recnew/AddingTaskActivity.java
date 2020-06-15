package com.example.recnew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddingTaskActivity extends AppCompatActivity {
    EditText etTitle, etDescription,etDate;
    String title = "",description = "",date="";
    Button btnAddItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adding_task);
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
                MainActivity.mAdapter.notifyData(MainActivity.myTask);
                etTitle.setText("");
                etDescription.setText("");
                etDate.setText("");
            }
        });
    }
}
