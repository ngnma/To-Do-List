package com.example.recnew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class TaskDetailsActivity extends AppCompatActivity {
    TextView titleTaskDetails,descriptionTaskDetails,dateTaskDetails;
    int size;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_details);
        titleTaskDetails = findViewById(R.id.details_title);
        descriptionTaskDetails = findViewById(R.id.details_description);
        dateTaskDetails = findViewById(R.id.details_date);
        getData();
        setData();
    }

    private void getData() {
        size=getIntent().getIntExtra("data1",0);
    }

    private void setData() {
        titleTaskDetails.setText(MainActivity.myTask.get(size).getTitle());
        descriptionTaskDetails.setText(MainActivity.myTask.get(size).getDescription());
        dateTaskDetails.setText(MainActivity.myTask.get(size).getDate());
    }


}
