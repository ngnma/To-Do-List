package com.example.recnew;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter  extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
    Context context;


    public MyAdapter(Context context){
        this.context=context;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        Switch aSwitch;
        ConstraintLayout mainLayout;
        public MyViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView_title);
            mainLayout=itemView.findViewById(R.id.mainLayout);
        }
    }
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.my_row,parent,false);
        return new MyViewHolder(view);
    }
    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
          holder.textView.setText(MainActivity.myTask.get(position).getTitle());
          holder.mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,TaskDetailsActivity.class);
                intent.putExtra("data1",position);
                context.startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return MainActivity.myTask.size();
    }
}
