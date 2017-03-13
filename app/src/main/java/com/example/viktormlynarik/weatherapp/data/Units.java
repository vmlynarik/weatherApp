package com.example.viktormlynarik.weatherapp.data;

import org.json.JSONObject;

/**
 * Created by viktormlynarik on 13/03/2017.
 */

public class Units implements JSONPopulator {
    private String temperature;

    public String getTemperature() {
        return temperature;
    }

    @Override
    public void populate(JSONObject data) {

        temperature = data.optString("temperature");


    }
}
