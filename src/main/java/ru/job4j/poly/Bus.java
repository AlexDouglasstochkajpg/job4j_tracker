package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void go() {
        System.out.println("Bus goes");
    }

    @Override
    public void passengers(int number) {
        System.out.println(number + " passengers");
    }

    @Override
    public double refuel(double fuel) {
        return fuel * 57.5;
    }
}
