package com.example.viktormlynarik.weatherapp.data;

import org.json.JSONObject;

/**
 * Created by viktormlynarik on 13/03/2017.
 */

public class Item implements JSONPopulator {

    private Condition condition;

    @Override
    public void populate(JSONObject data) {
        condition = new Condition();
        condition.populate(data.optJSONObject("condition"));

    }
}
