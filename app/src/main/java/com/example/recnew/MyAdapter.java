package com.example.recnew;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter  extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
    String[] mDataset;
    Context context;
//    Task[]t;

    public MyAdapter(Context context,String[] myDataset) {
        mDataset = myDataset;
        this.context=context;
    }

//    public MyAdapter(Context context,Task [] t) {
//        this.t=t;
//        this.context=context;
//    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ConstraintLayout mainLayout;
        public MyViewHolder(View v) {
            super(v);
            textView = v.findViewById(R.id.textView_title);
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
        holder.textView.setText(mDataset[position]);
        holder.mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,TaskDetailsActivity.class);
                intent.putExtra("deta1",mDataset[position]);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}
