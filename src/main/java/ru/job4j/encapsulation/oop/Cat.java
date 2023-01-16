package ru.job4j.encapsulation.oop;

public class Cat {
    private String food;
    private String name;

    public void show() {
        System.out.println(this.name + " " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        System.out.println("There are food.");
        Cat gav = new Cat();
        gav.giveNick("gav's");
        gav.eat("kotleta");
        gav.show();
        System.out.println("There are food.");
        Cat black = new Cat();
        black.giveNick("black's");
        black.eat("fish");
        black.show();
    }
}
