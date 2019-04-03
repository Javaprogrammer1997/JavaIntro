package com.hillel.hw12.cars;
import com.hillel.hw12.implement.Car;

public class PassengerCar extends Car {
    private int numberOfPassengers;

    public PassengerCar(String mark, int price, int fuelConsumption, int maxSpeed, int numberOfPassengers) {
        super(mark, price, fuelConsumption, maxSpeed);
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public String toString() {
        return "PassengerCars{" + " Mark = " + getMark() + " Price = " + getPrice() + " Fuel Consumption = " + getFuelConsumption() +
                " Max Speed " + getMaxSpeed() +
                " number Of Passengers = " + numberOfPassengers +
                '}';
    }
}
