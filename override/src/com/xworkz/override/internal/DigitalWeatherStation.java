package com.xworkz.override.internal;

public class DigitalWeatherStation extends WeatherStation{
    public DigitalWeatherStation() {
        System.out.println("DigitalWeatherStation: Constructor is running");
    }

    @Override
    public void recordTemperature() {
        System.out.println("DigitalWeatherStation: Recording temperature digitally");
    }

    public void displayHumidity() {
        System.out.println("DigitalWeatherStation: Displaying humidity levels");
    }

    public void sendAlert() {
        System.out.println("DigitalWeatherStation: Sending weather alerts to subscribers");
    }
}
