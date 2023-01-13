package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Ехать вперед");
    }

    @Override
    public void passengers() {
        System.out.println("Вместимость 20 пассажиров");
    }

    @Override
    public int refuel(int quantity, int price) {
        int temp = quantity * price;
        System.out.println("Литров: " + quantity + "; Цена: " + price + "; Сумма: " + temp);
        return temp;
    }
}
