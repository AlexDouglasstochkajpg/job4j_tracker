package ru.job4j.cast;

public class Plane implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " летает по воздуху");
    }

    @Override
    public void accommodate() {
        System.out.println(getClass().getSimpleName() + " вмещает более 100 пассажиров");
    }
}
