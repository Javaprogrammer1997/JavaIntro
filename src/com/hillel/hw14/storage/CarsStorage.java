package com.hillel.hw14.storage;

import com.hillel.hw14.implement.Car;

import java.util.List;

public interface CarsStorage {

    List<Car> readCars();

    void writeCars(List<Car> cars);
}
