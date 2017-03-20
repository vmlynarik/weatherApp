package com.example.viktormlynarik.weatherapp;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.viktormlynarik.weatherapp.data.Channel;
import com.example.viktormlynarik.weatherapp.service.WeatherServiceCallback;
import com.example.viktormlynarik.weatherapp.service.YahooWeatherService;
import com.testfairy.TestFairy;

public class WeatherActivity extends AppCompatActivity implements WeatherServiceCallback {

    private ImageView weatherIconImageView;
    private TextView temperatureTextView;
    private TextView conditionTextView;
    private TextView locationTextView;

    private YahooWeatherService service;
    private ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //add token between <>
        TestFairy.begin(this, "<bd6cbdc6dc68f6f8a02fcbc3d54041c045c3688b>");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);


        weatherIconImageView = (ImageView)findViewById(R.id.weatherIconImageView);
        temperatureTextView = (TextView)findViewById(R.id.temperatureTextView);
        conditionTextView = (TextView)findViewById(R.id.conditionTextView);
        locationTextView = (TextView)findViewById(R.id.locationTextView);

        service = new YahooWeatherService(this);
        dialog = new ProgressDialog(this);
        dialog.setMessage("Loading...");
    dialog.show();

        service.refreshWeather("Kosice, Slovakia");

    }

    @Override
    public void serviceSuccess(Channel channel) {
        dialog.hide();

    }

    @Override
    public void serviceFailure(Exception exception) {
        dialog.hide();
        Toast.makeText(this, exception.getMessage(), Toast.LENGTH_LONG).show();

    }
}
