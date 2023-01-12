package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Ехать вперед");
    }

    @Override
    public int passengers() {
        System.out.println("Вместимость 20 пассажиров");
        return 20;
    }

    @Override
    public int refuel(int price) {
        System.out.println("Заправить 60литров, цена: " + price);
        return 0;
    }
}
