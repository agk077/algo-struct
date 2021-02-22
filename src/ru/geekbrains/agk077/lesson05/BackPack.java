package ru.geekbrains.agk077.lesson05;

import java.util.ArrayList;
import java.util.List;

public class BackPack {
    private int weightFull;
    private int emptyWeight;
    private List<Stuff> stuff;

    public BackPack() {
        this.weightFull = 15;
        this.emptyWeight = 15;
        this.stuff = null;
    }

    public List<Stuff> getStuff() {
        return stuff;
    }

    public boolean getSuperThing(List<Stuff> st) {
        int index = 0;
        int maxPrice = 0;

        for (int i = 0; i < st.size(); i++) {
            if (st.get(i).getPrice() > maxPrice) {
                maxPrice = st.get(i).getPrice();
                index = i;
            }
        }

        System.out.println("Found max price element = " + st.get(index).getPrice());

        return maxPrice > 0;
    }

    public boolean addStuff(Stuff st) {
        if (stuff == null) stuff = new ArrayList<>();
        if (st.getWeight() <= weightFull) {
            this.stuff.add(st);
            weightFull = weightFull - st.getWeight();
            return true;
        }
        return false;
    }

    public int getWeightFull() {
        return weightFull;
    }

    public void setWeightFull(int weightFull) {
        this.weightFull = weightFull;
    }
}
