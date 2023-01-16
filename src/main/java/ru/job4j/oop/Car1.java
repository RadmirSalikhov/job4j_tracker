package ru.job4j.oop;

public class Car1 {
    private String brand;
    private String model;
    private static String carManual = "Инструкция к автомобилю";

    public Car1(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void startEngine() {
        System.out.println("Двигатель запущен");
    }

    public static TripComputer getTripComputer() {
        Car1 car = new Car1("Марка", "Модель");
        Car1.TripComputer tripComputer = car.new TripComputer();
        return tripComputer;
    }

    public class Transmission {

        public void accelerate() {
            System.out.println("Ускорение");
        }

    }

    public class Brakes {

        public void brake() {
            System.out.println("Торможение");
        }

    }

    public class TripComputer {

        public String info = "Бортовой компьютер";
        private String model = "Модель TripComputer";

        public void getInfo() {
            System.out.println("Модель TripComputer: " + this.model);
            System.out.println("Модель Car: " + Car1.this.model);
        }

    }

    public static class Manual {

        public static String getManual() {
            Car1 car1 = new Car1("Марка", "Модель");
            return "Модель: " + car1.model + ", Инструкция: " + carManual;
        }

    }
}
