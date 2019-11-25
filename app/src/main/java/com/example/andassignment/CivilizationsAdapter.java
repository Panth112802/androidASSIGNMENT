package com.example.andassignment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.andassignment.models.Civilization;

import java.util.ArrayList;

public class CivilizationsAdapter extends RecyclerView.Adapter<CivilizationsAdapter.ViewHolder>
        {
    private ArrayList<Civilization> mCivilization;
    final private OnListItemClickListener mOnListItemClickListener;

    CivilizationsAdapter(ArrayList<Civilization> civilization, OnListItemClickListener listener){
        mCivilization = civilization;
        mOnListItemClickListener = listener;
    }

    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.civilization_activity, parent, false);
        return new ViewHolder(view);
    }

    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        viewHolder.name.setText(mCivilization.get(position).getName());
        viewHolder.icon.setImageResource(mCivilization.get(position).getId());
    }

    public int getItemCount() {
        return mCivilization.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView name;
        ImageView icon;

        ViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tv_CivName);
            icon = itemView.findViewById(R.id.iv_Civicon);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            mOnListItemClickListener.onListItemClick(getAdapterPosition());
        }
    }

    public interface OnListItemClickListener {
        void onListItemClick(int clickedItemIndex);
    }





}
