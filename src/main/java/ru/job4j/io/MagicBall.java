package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Я великий Оракул. Что ты хочешь узнать? ");
        String question = input.nextLine();
        int answer = new Random().nextInt(3);
        if (answer == 0) {
            String yes = "Да";
            System.out.println(yes);
        } else if (answer == 1) {
            String no = "Нет";
            System.out.println(no);
        } else {
            String maybe = "Может быть";
            System.out.println(maybe);
        }
    }
}
