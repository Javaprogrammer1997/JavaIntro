package HW10;

public class MilitaryVehicles extends Car {
    private int LevelOfDestruction;

    public MilitaryVehicles(String mark, int price, int fuelConsumption, int maxSpeed, int levelOfDestruction) {
        super(mark, price, fuelConsumption, maxSpeed);
        LevelOfDestruction = levelOfDestruction;
    }

    public int getLevelOfDestruction() {
        return LevelOfDestruction;
    }

    public void setLevelOfDestruction(int levelOfDestruction) {
        LevelOfDestruction = levelOfDestruction;
    }

    @Override
    public String toString() {
        return "MilitaryVehicles{" + " Mark = " + getMark() + " Price = " + getPrice() + " Fuel Consumption = " + getFuelConsumption() +
                " Max Speed = " + getMaxSpeed() +
                " LevelOfDestruction = " + LevelOfDestruction +
                '}';
    }
}
