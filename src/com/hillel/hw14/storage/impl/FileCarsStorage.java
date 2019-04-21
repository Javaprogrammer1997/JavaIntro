package com.hillel.hw14.storage.impl;

import com.hillel.hw14.cars.MilitaryVehicles;
import com.hillel.hw14.cars.PassengerCar;
import com.hillel.hw14.cars.Truck;
import com.hillel.hw14.implement.Car;
import com.hillel.hw14.storage.CarsStorage;

import java.io.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
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

    public List<Car> readCars() {

        try (FileInputStream reader = new FileInputStream(inputFileName)) {
            String fileString = CreateString(reader);

            String[] carStrings = fileString.split(";" + System.lineSeparator());

            List<Car> cars = new LinkedList<Car>();

            for (int i = 0; i < carStrings.length; i++) {
                String[] carProperties = carStrings[i].split(",");
                switch (carProperties[0]) {
                    case "PassengerCar":
                        cars.add(new PassengerCar(carProperties));
                        break;

                    case "Truck":
                        cars.add(new Truck(carProperties));
                        break;

                    case "MilitaryVehicles":
                        cars.add(new MilitaryVehicles(carProperties));
                        break;
                }
            }

            return cars;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return Collections.emptyList();
    }

    private String CreateString(FileInputStream reader) throws IOException {
        byte[] fileBytes = new byte[reader.available()];
        reader.read(fileBytes);
        return new String(fileBytes);
    }


    public void writeCars(List<Car> cars) {
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
