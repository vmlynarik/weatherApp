package com.example.viktormlynarik.weatherapp.service;

import com.example.viktormlynarik.weatherapp.data.Channel;

/**
 * Created by viktormlynarik on 13/03/2017.
 */

public interface WeatherServiceCallback {
    void serviceSuccess(Channel channel);
    void serviceFailure(Exception exception);
}
