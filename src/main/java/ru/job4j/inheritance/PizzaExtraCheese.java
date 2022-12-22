package ru.job4j.inheritance;

public class PizzaExtraCheese extends Pizza {
    private String extra_cheese = " + extra cheese";

    @Override
    public String name() {
        return super.name() + extra_cheese;
    }
}
