package com.hillel.hw12.interfaces;

import com.hillel.hw12.exception.SearchCarForSpeedException;

import com.hillel.hw12.implement.Car;

public interface TaxiParkInter {

    int getcoastOfTaxiPark();

    Car[] getsearchCarsForSpeed(int minSpeed, int maxSpeed) throws SearchCarForSpeedException;

    Car[] getfuelConsumption();

}
