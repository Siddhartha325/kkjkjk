package com.example.user.broadcatexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler_view;
    Button btn_nxt;
    Myadapter myadapter;
    Model model;
    ArrayList<Model> al_list=new ArrayList<>();
    ArrayList<CheckBox>al_ch=new ArrayList<>();
    String arr[]={"India","Pakistan","China","Nepal","Bagladesh","India","Pakistan","China","Nepal",
            "Bagladesh","India","Pakistan","China","Nepal","Bagladesh"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        model=new Model();
        for (int i = 0; i <arr.length ; i++) {

         model.setName(arr[i]);
            al_list.add(model);
        }


        recycler_view=(RecyclerView)findViewById(R.id.recycler_view);
        myadapter=new Myadapter(al_list,MainActivity.this);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recycler_view.setLayoutManager(mLayoutManager);
        recycler_view.setAdapter(myadapter);
     //   al_list.add();

        btn_nxt=(Button)findViewById(R.id.nxt_btn);
        btn_nxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ii=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(ii);
            }
        });
    }

}
