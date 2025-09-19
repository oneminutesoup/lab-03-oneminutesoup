package com.example.listycitylab3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CityArrayAdapter extends ArrayAdapter<City> {

    public CityArrayAdapter(@NonNull Context context, @NonNull List<City> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.content, parent, false);
        }

        City city = getItem(position);
        if (city != null) {
            TextView cityName = view.findViewById(R.id.city_text);
            TextView provinceName = view.findViewById(R.id.province_text);
            cityName.setText(city.getName());
            provinceName.setText(city.getProvince());
        }

        return view;
    }
}
