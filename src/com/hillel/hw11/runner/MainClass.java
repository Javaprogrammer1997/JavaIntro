package com.hillel.hw11.runner;
import com.hillel.hw11.cars.*;
import com.hillel.hw11.implement.*;
import com.hillel.hw11.interfaces.TaxiParkInter;


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

        park.getcoastOfTaxiPark();
        System.out.println(park);

        park.getsearchCarsForSpeed(0, 220);
        System.out.println(park);

        park.getfuelConsumption();
        System.out.println(park);
    }
}
