package ru.job4j.polymorph;

public class Bus implements Vehicle2 {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " двигается по скоростным трассам");
    }

    @Override
    public void characteristics() {
        System.out.println(getClass().getSimpleName() + " пассажирский, междугородний");
    }
}
