package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Я великий Оракул. Что ты хочешь узнать? ");
        String question = input.nextLine();
        int answer = new Random().nextInt(3);
        String answers = "";
        if (answer == 0) {
            answers = "Да";
        } else if (answer == 1) {
            answers = "Нет";
        } else {
            answers = "Может быть";
        }
        System.out.println(answers);
    }
}
