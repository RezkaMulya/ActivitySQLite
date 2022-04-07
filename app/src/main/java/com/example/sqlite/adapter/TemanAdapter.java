package com.example.sqlite.adapter;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;


import com.example.sqlite.R;
import com.example.sqlite.database.Teman;

import java.util.ArrayList;

public class TemanAdapter extends RecyclerView.Adapter<TemanAdapter.TemanViewHolder> {
    private ArrayList<Teman> listData;

    public TemanAdapter(ArrayList<Teman> listD){

        this.listData = listD;
    }
    @Override
    public TemanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInf = LayoutInflater.from(parent.getContext());

        View v = layoutInf.inflate(R.layout.row_data_teman,parent,false);
        return new TemanViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull TemanViewHolder holder, int position) {
        String nm, tlp;
        nm = listData.get(position).getNama();
        tlp = listData.get(position).getTelepon();

        holder.namaTxt.setTextColor(Color.BLUE);
        holder.namaTxt.setTextSize(20);

        holder.namaTxt.setText(nm);
        holder.telponTxt.setText(tlp);
    }

    @Override
    public int getItemCount() {

        return (listData != null)? listData.size() : 0;
    }

    public class TemanViewHolder extends  RecyclerView.ViewHolder{
        private CardView kartu;
        private TextView namaTxt, telponTxt;
        public TemanViewHolder(View v){
            super(v);
            kartu = (CardView) v.findViewById(R.id.kartuku);
            namaTxt = (TextView) v.findViewById(R.id.textNama);
            telponTxt = (TextView) v.findViewById(R.id.textTelpon);

        }
    }
}
