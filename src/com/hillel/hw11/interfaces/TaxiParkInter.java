package com.hillel.hw11.interfaces;

import com.hillel.hw11.implement.Car;

public interface TaxiParkInter {

    int getcoastOfTaxiPark();
    Car[] getsearchCarsForSpeed(int minSpeed, int maxSpeed);
    Car[] getfuelConsumption();

}
