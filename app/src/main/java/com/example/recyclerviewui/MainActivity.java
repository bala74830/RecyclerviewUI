package com.example.recyclerviewui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView=findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<modelclass> modelclasses=new ArrayList<modelclass>();
         modelclasses.add(new modelclass("Who is the best among them?","Virat Kholi","M S Dhoni","Rohit Sharma","Hardik Pandya"));
         modelclasses.add(new modelclass("How many overs does T-20 match have?","20","10","50","5"));
         modelclasses.add(new modelclass("Odd man Out!","Kedar","Sachin","Vijay","akshay"));

         Adapter adapter=new Adapter(modelclasses,MainActivity.this);
         recyclerView.setAdapter(adapter);
    }
}