package ru.geekbrains.agk077.lesson05;

public class Stuff {
    private int price;
    private int weight;
    private String name;

    public Stuff(String name, int price, int weight) {
        this.price = price;
        this.weight = weight;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
