package HW10;

public class PassengerCars extends Car {
    private int numberOfPassengers;

    public PassengerCars(String mark, int price, int fuelConsumption, int maxSpeed, int numberOfPassengers) {
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
