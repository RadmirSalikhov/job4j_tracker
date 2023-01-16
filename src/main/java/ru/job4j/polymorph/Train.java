package ru.job4j.polymorph;

public class Train implements Vehicle2 {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " передвигается по рельсам");
    }

    @Override
    public void characteristics() {
        System.out.println(getClass().getSimpleName() + " товарный, для перевозки грузов");
    }
}
