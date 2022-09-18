package com.dacha.lesson2android3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView recyclerView;
private ArrayList<String>countryList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv_countries);
        countryList.add("Russia");
        countryList.add("Portugal");
        countryList.add("Ukraine");
        countryList.add("North America");
        countryList.add("Argentina");
        countryList.add("France");
        countryList.add("China");
        countryList.add("Madagastar");
        countryList.add("Germany");
        countryList.add("Italy");
        countryList.add("Mexico");
        countryList.add("Belgium");
        countryList.add("Spain");
        countryList.add("Slovakia");
        countryList.add("Kazakhstan");
        countryList.add("Kyrgyzstan");
        countryList.add("Uzbekistan");
        countryList.add("India");
        countryList.add("Australia");
        countryList.add("UK");
        CountryAdapter countryAdapter = new CountryAdapter(countryList);
        recyclerView.setAdapter(countryAdapter);
    }
}