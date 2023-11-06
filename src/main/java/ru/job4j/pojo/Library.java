package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book program = new Book("Programming", 205);
        Book clean = new Book("Clean code", 155);
        Book math = new Book("Mathematics", 510);
        Book chem = new Book("Chemistry", 250);
        Book[] books = new Book[4];
        books[0] = program;
        books[1] = clean;
        books[2] = math;
        books[3] = chem;
        for (int i = 0; i < books.length; i++) {
            Book lib = books[i];
            System.out.println(lib.getName() + " : " + lib.getNumber());
        }

        System.out.println();
        Book temp = books[0];
        books[0] = chem;
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            Book lib = books[i];
            System.out.println(lib.getName() + " : " + lib.getNumber());
        }

        System.out.println();
        for (int i = 1; i < books.length; i++) {
            if (books[i].getName().equals("Clean code")) {
                System.out.println(books[i].getName() + " : " + books[i].getNumber());
            }
        }
    }
}
