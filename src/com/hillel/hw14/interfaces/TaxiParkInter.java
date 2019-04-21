package com.hillel.hw14.interfaces;

import com.hillel.hw14.exception.SearchCarForSpeedException;

import com.hillel.hw14.implement.Car;

import java.util.List;

public interface TaxiParkInter {

    int getcoastOfTaxiPark();

    List<Car> getsearchCarsForSpeed(int minSpeed, int maxSpeed) throws SearchCarForSpeedException;

    List<Car> getfuelConsumption();

}
