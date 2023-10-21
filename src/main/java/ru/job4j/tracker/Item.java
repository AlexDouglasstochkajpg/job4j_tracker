package ru.job4j.tracker;

public class Item {
    private int id;
    private String name;

    public Item() {
    }

    public Item(String name) {
        this.name = name;
    }

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void printInfo() {
        System.out.println("id: " + id);
        System.out.println("name: " + name);
    }

    public static void main(String[] args) {
        Item first = new Item();
        first.printInfo();
        Item second = new Item("Jack");
        second.printInfo();
        Item third = new Item(25, "Jack");
        third.printInfo();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}