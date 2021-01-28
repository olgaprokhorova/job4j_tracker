package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void go() {
        System.out.println("Bus is go");
    }

    @Override
    public void passenger(int number) {
        System.out.println("Number of passengers is " + number);
    }

    @Override
    public double fillUp(double fuel) {
        return 0;
    }
}
