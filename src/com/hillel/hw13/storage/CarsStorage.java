package com.hillel.hw13.storage;

import com.hillel.hw13.implement.Car;

public interface CarsStorage {

    Car[] readCars();

    void writeCars(Car[] cars);
}
