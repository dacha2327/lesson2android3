package com.dacha.lesson2android3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
public class CountriesViewHolder extends RecyclerView.ViewHolder {
    private TextView tv_countries;
    public CountriesViewHolder(@NonNull View itemView) {
        super(itemView);
        tv_countries = itemView.findViewById(R.id.tv_countries);
    }
    public void bind(String countries){tv_countries.setText(countries);}
}
