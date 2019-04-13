package com.hillel.hw13.cars;

import com.hillel.hw13.implement.Car;


public class PassengerCar extends Car {
    private int numberOfPassengers;

    public PassengerCar(int price, int fuelConsumption, int maxSpeed, int numberOfPassengers) {
        super(price, fuelConsumption, maxSpeed);
        this.numberOfPassengers = numberOfPassengers;
    }

    public PassengerCar(String[] carProperties) {
        this(Integer.parseInt(carProperties[1]), Integer.parseInt(carProperties[2]),
                Integer.parseInt(carProperties[3]), Integer.parseInt(carProperties[4]));
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public String toString() {
        return "PassengerCars = " + ", " + " Price = " + getPrice() + ", " + " Fuel Consumption = " + getFuelConsumption() + ", " +
                " Max Speed " + getMaxSpeed() + ", " +
                " Number Of Passengers = " + numberOfPassengers + ";" + "\n";

    }

    public String toFileFormat() {
        return "PassengerCar," + getPrice() + "," + getFuelConsumption() + "," + getMaxSpeed() + "," + getNumberOfPassengers();
    }
}
