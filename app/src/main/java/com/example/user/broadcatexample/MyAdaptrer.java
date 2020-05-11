package com.example.user.broadcatexample;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by User on 05-04-2017.
 */

public class MyAdaptrer extends RecyclerView.Adapter<MyAdaptrer.MyAdapterViewHolder>{


    @Override
    public MyAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(MyAdapterViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public  class MyAdapterViewHolder extends RecyclerView.ViewHolder{
        public MyAdapterViewHolder(View itemView) {
            super(itemView);
        }
    }
}
