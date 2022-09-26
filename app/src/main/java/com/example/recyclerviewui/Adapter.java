package com.example.recyclerviewui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{
    ArrayList<modelclass>models;
    Context context;

    public Adapter(ArrayList<modelclass> models, Context context) {
        this.models = models;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_item,parent,false);
        return new Adapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        modelclass modelData = models.get(position);
        holder.question.setText(modelData.getQuestion());
        holder.opt1.setText(modelData.getOpt1());
        holder.opt2.setText(modelData.getOpt2());
        holder.opt3.setText(modelData.getOpt3());
        holder.opt4.setText(modelData.getOpt4());
    }

    @Override
    public int getItemCount() {
        return models.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView question;
        TextView opt1;
        TextView opt2;
        TextView opt3;
        TextView opt4;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            question=itemView.findViewById(R.id.question);
            opt1=itemView.findViewById(R.id.opt1);
            opt2=itemView.findViewById(R.id.opt2);
            opt3=itemView.findViewById(R.id.opt3);
            opt4=itemView.findViewById(R.id.opt4);
        }
    }
}
