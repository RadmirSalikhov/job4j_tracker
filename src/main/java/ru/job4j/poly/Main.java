package ru.job4j.poly;

public class Main {
    public static void main(String[] args) {
        Transport transport = new Bus();
        transport.drive();
        transport.passengers();
        transport.refuel(60, 25);
    }
}
