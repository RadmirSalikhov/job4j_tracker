package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {

    }

    @Override
    public int passengers() {
        return 0;
    }

    @Override
    public int refuel(int price) {
        return 0;
    }
}
