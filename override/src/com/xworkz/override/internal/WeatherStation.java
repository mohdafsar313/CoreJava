package com.xworkz.override.internal;

public class WeatherStation {
    private String name;
    private  String location;
    public WeatherStation() {
        System.out.println("WeatherStation: Constructor is running");
    }

    public void recordTemperature() {
        System.out.println("WeatherStation: Recording temperature manually");
    }
    public void setName(String name,String location){
        this.name=name;
        this.location=location;
    }
    @Override
    public String toString() {
        return "station name"+name+", location"+location;
    }
}
