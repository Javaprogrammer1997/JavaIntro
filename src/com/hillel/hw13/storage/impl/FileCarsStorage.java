package com.hillel.hw13.storage.impl;

import com.hillel.hw13.cars.MilitaryVehicles;
import com.hillel.hw13.cars.PassengerCar;
import com.hillel.hw13.cars.Truck;
import com.hillel.hw13.implement.Car;
import com.hillel.hw13.storage.CarsStorage;

import java.io.*;
import java.util.StringJoiner;


public class FileCarsStorage implements CarsStorage {

    private String inputFileName;
    private String outputFileName;

    public FileCarsStorage(String inputFileName, String outputFileName) {
        this.inputFileName = inputFileName;
        this.outputFileName = outputFileName;
    }

    public FileCarsStorage(String fileName) {
        this.inputFileName = fileName;
        this.outputFileName = fileName;
    }

    public Car[] readCars() {

        try (FileInputStream reader = new FileInputStream(inputFileName)) {
            String fileString = CreateString(reader);

            String[] carStrings = fileString.split(";" + System.lineSeparator());

            Car[] cars = new Car[carStrings.length];

            for (int i = 0; i < carStrings.length; i++) {
                String[] carProperties = carStrings[i].split(",");
                switch (carProperties[0]) {
                    case "PassengerCar":
                        cars[i] = new PassengerCar(carProperties);
                        break;

                    case "Truck":
                        cars[i] = new Truck(carProperties);
                        break;

                    case "MilitaryVehicles":
                        cars[i] = new MilitaryVehicles(carProperties);
                        break;
                }
            }

            return cars;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new Car[0];
    }

    private String CreateString(FileInputStream reader) throws IOException {
        byte[] fileBytes = new byte[reader.available()];
        reader.read(fileBytes);
        return new String(fileBytes);
    }


    public void writeCars(Car[] cars) {
        try (FileOutputStream writer = new FileOutputStream(outputFileName)) {
            StringJoiner sj = new StringJoiner(";" + System.lineSeparator());
            for (Car car : cars) {
                sj.add(car.toFileFormat());
            }
            writer.write(sj.toString().getBytes());


        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
