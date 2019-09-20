package com.example.engineertestpranay;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.engineertestpranay.models.Hit;

import java.util.ArrayList;
import java.util.List;

public class TitleAdapter extends RecyclerView.Adapter<TitleAdapter.ViewHolder> {
    List<Hit> mHit =new ArrayList<>();

    public void setData(List<Hit> hit)
    {
        mHit=hit;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.card_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
       Hit data= mHit.get(position);
       holder.mView.setText(data.getTitle());
    }

    @Override
    public int getItemCount() {
        return mHit.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView mView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mView=itemView.findViewById(R.id.name);
        }
    }
}
