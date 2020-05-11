package com.example.user.broadcatexample;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by User on 04-04-2017.
 */

public class Myadapter extends RecyclerView.Adapter<Myadapter.ViewHolder> {

    private ArrayList<Model> list=new ArrayList<>();
    private LayoutInflater minflater;
    private Context mContext;
    int numberOfRows;
    boolean[] checkedStatus = new boolean[numberOfRows];

    public Myadapter(ArrayList<Model>list, Context mContext){

        this.list=list;
        this.mContext=mContext;
        this.minflater=LayoutInflater.from(mContext);

    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View view=minflater.inflate(R.layout.child,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final int pos = position;
        holder.txt.setText(list.get(position).getName());
        holder.check.setOnCheckedChangeListener(null);
        holder.check.setChecked(list.get(position).isSelected());

        holder.check.setTag(list.get(position));


      /*  holder.check.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CheckBox cb = (CheckBox) v;
                Model contact = (Model) cb.getTag();

                contact.setSelected(cb.isChecked());
                list.get(pos).setSelected(cb.isChecked());

                Toast.makeText(
                        v.getContext(),
                        "Clicked on Checkbox: " + cb.getText() + " is "
                                + cb.isChecked(), Toast.LENGTH_LONG).show();
            }
        });*/


    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView txt;
        private CheckBox check;
        public ViewHolder(View itemView) {
            super(itemView);
            txt=(TextView)itemView.findViewById(R.id.child_txt);
            check=(CheckBox)itemView.findViewById(R.id.check);
        }

        @Override
        public void onClick(View view) {

        }
    }
}
