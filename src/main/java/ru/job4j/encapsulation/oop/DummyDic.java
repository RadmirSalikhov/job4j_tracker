package ru.job4j.encapsulation.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic dic = new DummyDic();
        String ens = dic.engToRus("test");
        System.out.println(ens);
    }
}
