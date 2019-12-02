package com.jks.android.myapplication.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.jks.android.myapplication.R;
import com.jks.android.myapplication.model.SongModel;

import java.util.ArrayList;

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.SongViewHolder> {

    ArrayList<SongModel> list;

    Context context;
    SongClickListener mListener;

   public interface SongClickListener {
        void onClick(int pos);
    }

    public SongAdapter(ArrayList<SongModel> list, Context context, SongClickListener mListener) {
        this.list = list;
        this.context = context;
        this.mListener = mListener;
    }

    class SongViewHolder extends RecyclerView.ViewHolder {
        Button btn_sang_item;


        SongViewHolder(View itemView) {
            super(itemView);
            btn_sang_item = itemView.findViewById(R.id.btn_sang_item);
        }
    }

    @NonNull
    @Override
    public SongViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View mView = inflater.inflate(R.layout.item_sang_list, parent, false);

        return new SongViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(final SongViewHolder viewHolder, final int position) {

        SongModel model = list.get(viewHolder.getAdapterPosition());

        viewHolder.btn_sang_item.setText(list.get(position).getName());
        viewHolder.btn_sang_item.setOnClickListener(v -> {
            mListener.onClick(position);
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


}