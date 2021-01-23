package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book capote = new Book("Breakfast at Tiffany's", 160);
        Book martin = new Book("Clean Code", 465);
        Book austen = new Book("Emma", 350);
        Book osborne = new Book("Look Back in Anger", 288);
        Book[] books = new Book[4];
        books[0] = capote;
        books[1] = martin;
        books[2] = austen;
        books[3] = osborne;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " - " + books[i].getNumberOfPage());
        }
        System.out.println();
        System.out.println("Replace book 1 and book 4");
        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " - " + books[i].getNumberOfPage());
        }
        System.out.println();
        System.out.println("Print Clean Code book");
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals("Clean Code")) {
                System.out.println(books[i].getName() + " - " + books[i].getNumberOfPage());
            }
        }
    }
}
