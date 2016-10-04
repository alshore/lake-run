package com.andrew;

import java.util.*;

public class Main {

    public static Scanner numberScanner = new Scanner(System.in);
    public static Scanner stringScanner = new Scanner(System.in);

    public static void main(String[] args) {

        String nextLake = "y";
        //loops while the user has another lake to enter
        ArrayList<String> lakeNames = new ArrayList<>();
        while (nextLake.equalsIgnoreCase("y")) {
            System.out.println("Enter the name of the lake: ");
            String lakeName = stringScanner.nextLine();
            lakeNames.add(lakeName);
            System.out.println("Enter another lake (y for yes)? ");
            nextLake = stringScanner.nextLine();
        }
        for (String name : lakeNames) {
            System.out.println("Enter the distance of lake " + name + " in miles): ");
            double distance = numberScanner.nextDouble();
            Lake lake = new Lake(name, distance);
            lake = enterLakeInfo(lake);
            System.out.println("Your times for lake " + lake.getLakeName() + " are: ");
            ArrayList<Double> tileMist = lake.getRunTimes();
            System.out.println(tileMist);
        }
    }
    private static Lake enterLakeInfo(Lake lake) {
        String moreTimes = "y";
        while (moreTimes.equalsIgnoreCase("y")) {
            System.out.println("Enter your time: ");
            Double runTime = numberScanner.nextDouble();
            lake.addRunTime(runTime);
            System.out.println("Do you have more times for this route (y or n)? ");
            moreTimes = stringScanner.nextLine();
        }
        return lake;
    }
}