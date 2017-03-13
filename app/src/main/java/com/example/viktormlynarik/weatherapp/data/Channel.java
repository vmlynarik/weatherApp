package com.example.viktormlynarik.weatherapp.data;

import org.json.JSONObject;

/**
 * Created by viktormlynarik on 13/03/2017.
 */

public class Channel implements JSONPopulator {
    private Units units;
    private Item item;

    public Units getUnits() {
        return units;
    }

    public Item getItem() {
        return item;
    }

    @Override
    public void populate(JSONObject data) {


        units = new Units();
        units.populate(data.optJSONObject("units"));


        item = new Item();
        item.populate(data.optJSONObject("item"));
    }
}
