package com.example.recnew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;

public class TaskDetailsActivity extends AppCompatActivity {
    TextView titleTaskDetails,descriptionTaskDetails,dateTaskDetails;
    String data1,data2,data3;
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
        data1 = getIntent().getStringExtra("data1");
        data2 = getIntent().getStringExtra("data2");
        data3 = getIntent().getStringExtra("data3");
    }

    private void setData() {
        titleTaskDetails.setText(data1);
        descriptionTaskDetails.setText(data2);
        dateTaskDetails.setText(data3);
    }


}
