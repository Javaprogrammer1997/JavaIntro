package com.hillel.hw14.runner;

import com.hillel.hw14.implement.*;
import com.hillel.hw14.interfaces.TaxiParkInter;
import com.hillel.hw14.storage.CarsStorage;
import com.hillel.hw14.storage.impl.FileCarsStorage;



import java.util.List;

public class MainClass {

    public static void main(String[] args) {
        CarsStorage storage = new FileCarsStorage("input.txt", "output.txt");

        List<Car> cars = storage.readCars();

        TaxiParkInter park = new TaxiPark(cars);

        System.out.print("Coast TaxiPark = ");
        System.out.println(park.getcoastOfTaxiPark());

       /* System.out.print("Search cars by speed = ");
        try {
            Car[] searchCarsBySpeed = park.getsearchCarsForSpeed(0, -1);
            for (int i = 0; i < searchCarsBySpeed.length; i++) {
                System.out.println(searchCarsBySpeed[i].toString());
            }
        } catch (SearchCarForSpeedException e) {
            System.out.println("Exception warning: " + e);
        }*/

        System.out.print("Cars fuel consumption = ");
        park.getfuelConsumption();
        System.out.println(park);
        storage.writeCars(cars);

    }
}