package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book fantasies = new Book("Fantasies", 102);
        Book future = new Book("Future", 403);
        Book reality = new Book("Real world", 210);
        Book cleancode = new Book("Clean code", 100);
        Book[] books = new Book[4];
        books[0] = fantasies;
        books[1] = future;
        books[2] = reality;
        books[3] = cleancode;
        for (Book book : books) {
            System.out.println(book.getName() + " - " + book.getPages() + " страниц");
        }
        System.out.println();
        System.out.println("Change Fantasies to Clean code");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (Book book : books) {
            System.out.println(book.getName() + " - " + book.getPages() + " страниц");
        }
        System.out.println();
        System.out.println("Output only: ");
        for (Book book : books) {
            if (book.equals(books[0])) {
                System.out.println(book.getName() + " - " + book.getPages() + " страниц");
            }
        }
    }
}
