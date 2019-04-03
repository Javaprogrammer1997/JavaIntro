package com.hillel.hw12.cars;


import com.hillel.hw12.implement.Car;
import com.hillel.hw12.interfaces.CarInter;

public class Truck extends Car {
    private int loadCapacity;

    public Truck(String mark, int price, int fuelConsumption, int maxSpeed, int loadCapacity) {
        super(mark, price, fuelConsumption, maxSpeed);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Trucks{" + " Mark = " + getMark() + " Price = " + getPrice() + " Fuel Consumption = " + getFuelConsumption() +
                " Max Speed = " + getMaxSpeed() +
                " loadCapacity = " + loadCapacity +
                '}';
    }
}

