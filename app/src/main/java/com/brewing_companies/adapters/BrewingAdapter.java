package com.brewing_companies.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

import com.brewing_companies.R;
import com.brewing_companies.adapters.BrewingViewHolder;
import com.brewing_companies.model.BrewingDetails;

import java.util.ArrayList;

public class BrewingAdapter extends ListAdapter<BrewingDetails, BrewingViewHolder> {
    private ArrayList<BrewingDetails> brewingDetailsList;

    private static final DiffUtil.ItemCallback<BrewingDetails> DIFF_CALLBACK = new DiffUtil.ItemCallback<BrewingDetails>() {


        @Override
        public boolean areItemsTheSame(@NonNull BrewingDetails oldItem, @NonNull BrewingDetails newItem) {
            return oldItem.equals(newItem);
        }

        @Override
        public boolean areContentsTheSame(@NonNull BrewingDetails oldItem, @NonNull BrewingDetails newItem) {
            return oldItem.equals(newItem);
        }
    };

    public BrewingAdapter(ArrayList<BrewingDetails> brewingDetailsList) {
        super(DIFF_CALLBACK);
        this.brewingDetailsList = brewingDetailsList;
        submitList(brewingDetailsList);
    }

    @Override
    public int getItemCount() {
        return brewingDetailsList.size();
    }

    @NonNull
    @Override
    public BrewingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_recycler_item_brewing,parent,false);
        return new BrewingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BrewingViewHolder holder, int position) {
        holder.displayBrewingDetails(brewingDetailsList.get(position));

    }
}
