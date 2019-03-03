package HW8;

public class Processor {
    public void printCars(Cars cars) {
        System.out.println("Car id = " + cars.id + ", Mark = " + cars.mark + ", Model =  " + cars.model +
                ", Year Of Release =  " + cars.yearOfRelease + ", Color = " + cars.color +
                ", Price = " + cars.price + ", Registration number = " + cars.registrationNumber);
    }

    public void findCarsByMark(Cars[] cars, String mark) {
        System.out.println("List of cars by mark = " + mark);
        for (Cars car : cars) {
            if (car.mark.equals(mark)) {
                printCars(car);
            }
        }
    }
    // Не знаю, как сделать по другому, если ты говорил сравнивать через equals. Это самый простой способ
    public void listOfCarsThatHaveBeenOperatedForMoreYears(Cars[] cars, String model, int years) {
        System.out.println("The list of cars that have been operated for more years = " + model + " " + years);

        for (Cars car : cars) {
            if (car.model.equals(model) && car.years() > years) {
                printCars(car);
            }
        }
    }

    // Решил попробовать через обычный For, хотел понять как делается разными способами
    public void searchForCarsForMoreThanTheSpecified(Cars[] cars, int yearOfRelease, int price) {
        System.out.println("List of cars of a given year of release, the price of which is higher than the specified - " + yearOfRelease + " " + price);
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].yearOfRelease == yearOfRelease) {
                if (cars[i].price > price) {
                    printCars(cars[i]);
                }
            }
        }
    }

}
