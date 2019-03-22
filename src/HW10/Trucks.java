package HW10;

public class Trucks extends Car {
    private int loadCapacity;

    public Trucks(String mark, int price, int fuelConsumption, int maxSpeed, int loadCapacity) {
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
