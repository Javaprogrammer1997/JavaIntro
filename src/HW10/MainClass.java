package HW10;

public class MainClass {
    public static void main(String[] args) {
        Car[] taxiPark = new Car[]{
                new Trucks("Reno", 65000, 20, 180, 25000),
                new Trucks("Scania", 100000, 15, 220, 30000),
                new MilitaryVehicles("T-34", 85000, 50, 35, 5),
                new MilitaryVehicles("T-190", 120000, 70, 60, 10),
                new PassengerCars("Lanos", 5000, 6, 225, 4),
                new PassengerCars("BMW", 10000, 9, 300, 5)
        };

        TaxiPark park = new TaxiPark(taxiPark);

        park.getcoastOfTaxiPark();
        System.out.println(park);

        park.getsearchCarsForSpeed(0, 220);
        System.out.println(park);

        park.getfuelConsumption();
        System.out.println(park);
    }
}
