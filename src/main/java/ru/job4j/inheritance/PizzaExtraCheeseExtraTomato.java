package ru.job4j.inheritance;

public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {
    private String extra_tomato = " + extra tomato";

    @Override
    public String name() {
        return super.name() + extra_tomato;
    }
}
