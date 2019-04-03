package com.hillel.hw12.runner;

import com.hillel.hw12.cars.*;
import com.hillel.hw12.implement.*;
import com.hillel.hw12.interfaces.TaxiParkInter;
import com.hillel.hw12.exception.SearchCarForSpeedException;

public class MainClass {

    public static void main(String[] args) {
        Car[] taxiPark = new Car[]{
                new Truck("Reno", 65000, 20, 180, 25000),
                new Truck("Scania", 100000, 15, 220, 30000),
                new MilitaryVehicles("T-34", 85000, 50, 35, 5),
                new MilitaryVehicles("T-190", 120000, 70, 60, 10),
                new PassengerCar("Lanos", 5000, 6, 225, 4),
                new PassengerCar("BMW", 10000, 9, 300, 5)
        };

        TaxiParkInter park = new TaxiPark(taxiPark);

        System.out.print("Coast TaxiPark = ");
        System.out.println(park.getcoastOfTaxiPark());

        System.out.print("Search cars by speed = ");
        try{
            Car[] searchCarsBySpeed = park.getsearchCarsForSpeed(0, -1);
            for(int i = 0; i < searchCarsBySpeed.length; i++){
                System.out.println(searchCarsBySpeed[i].toString());
            }
        }catch (SearchCarForSpeedException e){
            System.out.println("Exception warning: " + e);
        }

        System.out.print("Cars fuel consumption = ");
        park.getfuelConsumption();
        System.out.println(park);

    }
}