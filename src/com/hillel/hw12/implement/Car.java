package com.hillel.hw12.implement;

import com.hillel.hw12.interfaces.CarInter;

public class Car implements CarInter {

        private String mark;
        private int price;
        private int fuelConsumption;
        private int maxSpeed;


    public Car(String mark, int price, int fuelConsumption, int maxSpeed) {
        this.mark = mark;
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
    }

    public String getMark() {
            return mark;
        }

        public void setMark(String mark) {
            this.mark = mark;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getFuelConsumption() {
            return fuelConsumption;
        }

        public void setFuelConsumption(int fuelConsumption) {
            this.fuelConsumption = fuelConsumption;
        }

        public int getMaxSpeed() {
            return maxSpeed;
        }

        public void setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
        }

        @Override
        public String toString() {
            return "CarInter{" +
                    "price=" + price +
                    ", fuelConsumption=" + fuelConsumption +
                    ", maxSpeed=" + maxSpeed +
                    '}';
        }
}
