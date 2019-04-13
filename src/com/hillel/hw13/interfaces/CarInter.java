package com.hillel.hw13.interfaces;

public interface CarInter {


    int getPrice();

    void setPrice(int price);

    int getFuelConsumption();

    void setFuelConsumption(int fuelConsumption);

    int getMaxSpeed();

    void setMaxSpeed(int maxSpeed);

    default String toFileFormat() {
        return "";
    }


}
