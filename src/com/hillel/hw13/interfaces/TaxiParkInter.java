package com.hillel.hw13.interfaces;

import com.hillel.hw13.exception.SearchCarForSpeedException;

import com.hillel.hw13.implement.Car;

public interface TaxiParkInter {

    int getcoastOfTaxiPark();

    Car[] getsearchCarsForSpeed(int minSpeed, int maxSpeed) throws SearchCarForSpeedException;

    Car[] getfuelConsumption();

}
