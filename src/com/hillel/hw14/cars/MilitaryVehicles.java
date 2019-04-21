package com.hillel.hw14.cars;

import com.hillel.hw14.implement.Car;


public class MilitaryVehicles extends Car {
    private int LevelOfDestruction;

    public MilitaryVehicles(int price, int fuelConsumption, int maxSpeed, int levelOfDestruction) {
        super(price, fuelConsumption, maxSpeed);
        LevelOfDestruction = levelOfDestruction;
    }

    public MilitaryVehicles(String[] carProperties) {
        this(Integer.parseInt(carProperties[1]), Integer.parseInt(carProperties[2]),
                Integer.parseInt(carProperties[3]), Integer.parseInt(carProperties[4]));
    }

    public int getLevelOfDestruction() {
        return LevelOfDestruction;
    }

    public void setLevelOfDestruction(int levelOfDestruction) {
        LevelOfDestruction = levelOfDestruction;
    }

    @Override
    public String toString() {
        return "MilitaryVehicles = " + ", " + " Price = " + getPrice() + ", " + " Fuel Consumption = " + getFuelConsumption() + ", " +
                " Max Speed = " + getMaxSpeed() + ", " +
                " LevelOfDestruction = " + LevelOfDestruction + ";" + "\n";

    }

    public String toFileFormat() {
        return "MilitaryVehicles," + getPrice() + "," + getFuelConsumption() + "," + getMaxSpeed() + "," + getLevelOfDestruction();
    }

}
