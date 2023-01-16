package ru.job4j.polymorph;

public class Airplane implements Vehicle2 {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " летает в воздухе");
    }

    @Override
    public void characteristics() {
        System.out.println(getClass().getSimpleName() + " для малой авиации");
    }
}
