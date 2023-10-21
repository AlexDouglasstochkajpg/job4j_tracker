package ru.job4j.oop;

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
        System.out.println("Active: " + active);
        System.out.println("Status: " + status);
        System.out.println("Message " + message);
    }

    public static void main(String[] args) {
        Error first = new Error(true, 100, "Hello");
        first.printInfo();
        Error second = new Error(true, 200, "How are you?");
        second.printInfo();
        Error third = new Error(true, 300, "Goodbye");
        third.printInfo();
        Error error = new Error();
        error.printInfo();
    }
}
