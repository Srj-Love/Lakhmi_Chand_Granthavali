package com.jks.android.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jks.android.myapplication.R;
import com.jks.android.myapplication.model.JsonDataModel;

import java.util.ArrayList;

public class SongChildAdapter extends RecyclerView.Adapter<SongChildAdapter.SongViewHolder> {

    ArrayList<JsonDataModel.DataStoryList> list;

    Context context;
    SongClickListener mListener;

   public interface SongClickListener {
        void onSubClick(int pos);
    }

    public SongChildAdapter(ArrayList<JsonDataModel.DataStoryList> list, Context context, SongClickListener mListener) {
        this.list = list;
        this.context = context;
        this.mListener = mListener;
    }

    public class SongViewHolder extends RecyclerView.ViewHolder {
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

        JsonDataModel.DataStoryList model = list.get(viewHolder.getAdapterPosition());

        viewHolder.btn_sang_item.setText(model.getName());
        viewHolder.btn_sang_item.setOnClickListener(v -> {
            mListener.onSubClick(viewHolder.getAdapterPosition());
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


}