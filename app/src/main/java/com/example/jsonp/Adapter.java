package com.example.jsonp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends ArrayAdapter<Saccos> {


    private List<Saccos> saccos;
    private Context mCtx;

    //here we are getting the saccoslist and context
    //so while creating the object of this adapter class we need to give saccoslist and context
    public Adapter(List<Saccos> saccos, Context mCtx){
        super(mCtx, R.layout.cutom_list_layout, saccos);
        this.saccos = saccos;
        this.mCtx = mCtx;

    }

    //this method returns the list view
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //getting the layoutinflater
        LayoutInflater inflater = LayoutInflater.from(mCtx);

        //creating a view with our xml layout
        View listViewItem = inflater.inflate(R.layout.cutom_list_layout, null, true);

        //getting text views
        TextView tvName = listViewItem.findViewById(R.id.circleTitle);
        TextView tvDesc = listViewItem.findViewById(R.id.circledescription);

        //getting the circle for the specific possition
        Saccos sacco = saccos.get(position);

        //setting the textview values
        tvName.setText(sacco.getName());
        tvDesc.setText(sacco.getDescription());

        return listViewItem;

    }

}


