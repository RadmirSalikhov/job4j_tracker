package ru.job4j.encapsulation.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Активный: " + active);
        System.out.println("Сигнал: " + status);
        System.out.println("Сообщение: " + message);
    }

    public static void main(String[] args) {
        Error explicit = new Error();
        explicit.printInfo();
        Error error2 = new Error(true, 100, "Hi");
        error2.printInfo();
    }
}
