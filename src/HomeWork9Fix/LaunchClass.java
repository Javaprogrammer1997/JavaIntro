package HomeWork9Fix;

public class LaunchClass {
    public static void main(String[] args) {
        Cars[] cars = new Cars[]{
                new Cars(1, "BMW", "M6", 2015, "Black", 30000, 1331),
                new Cars(2, "Mercedes", "AMG", 2018, "Red", 50000, 9451),
                new Cars(3, "Audi", "TT", 2017, "Grey", 120000, 353),
                new Cars(4, "Bentley", "Classic", 2017, "Black", 500000,12345),
                new Cars(5, "Lamborghini", "Galardo", 2011, "Yellow", 90000, 5468)
        };
        Processor processor = new Processor();

        processor.findCarsByMark(cars, "Mercedes");
        processor.listOfCarsThatHaveBeenOperatedForMoreYears(cars, "Galardo", 5);
        processor.searchForCarsForMoreThanTheSpecified(cars, 2017, 100000);

    }
}
