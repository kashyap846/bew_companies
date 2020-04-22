package com.brewing_companies.adapters;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.brewing_companies.R;
import com.brewing_companies.activities.BrewDetailsActivity;
import com.brewing_companies.application.BrewingApplication;
import com.brewing_companies.model.BrewingDetails;

import java.io.Serializable;
import java.util.ArrayList;

public class BrewingViewHolder extends RecyclerView.ViewHolder {
    private ArrayList<BrewingDetails> brewingList;
    private TextView brewingName,place;

    public TextView getBrewingName() {
        return brewingName;
    }

    public TextView getPlace() {
        return place;
    }

    public BrewingViewHolder(@NonNull View itemView) {
        super(itemView);
        this.brewingName = itemView.findViewById(R.id.brewing_name);
        this.place = itemView.findViewById(R.id.place);
    }

    public void displayBrewingDetails(BrewingDetails brewingDetails){
        brewingName.setText(brewingDetails.getName());
        place.setText(brewingDetails.getCity()+", "+brewingDetails.getState()+", "+brewingDetails.getCity());
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent brewDetailsIntent= new Intent(BrewingApplication.getContext(), BrewDetailsActivity.class);
                brewDetailsIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                brewDetailsIntent.putExtra("brewDetailsObj", (Serializable) brewingDetails);
                BrewingApplication.getContext().startActivity(brewDetailsIntent);

            }
        });
    }
}
