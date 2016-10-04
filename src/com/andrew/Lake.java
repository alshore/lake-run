package com.andrew;


import java.lang.reflect.Array;
import java.util.ArrayList;

public class Lake {

    private String name;
    private ArrayList<Double> runTime;
    private double distance;

    public double getDistance() {
        return distance;
    }
    public void setDistance(double newDistance) {
        this.distance = newDistance;
    }
    public String getLakeName() {
        return name;
    }
    public void setLakeName(String newName) {
        this.name = newName;
    }

    Lake(String lakeName, double runDistance) {

        this.name = lakeName;
        this.distance = runDistance;
        this.runTime = new ArrayList<>();
    }

    public void addRunTime(Double time) {
        this.runTime.add(time);
    }

    public void removeRunTime(Double time) {
        this.runTime.remove(runTime.indexOf(time));
    }
    public ArrayList<Double> getRunTimes() {
        ArrayList<Double> timeList = new ArrayList<>();
        for (int i = 0; i < this.runTime.size(); i++) {
            timeList.add(this.runTime.get(i));
        }
        return timeList;
    }
}
