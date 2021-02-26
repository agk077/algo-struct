package ru.geekbrains.agk077.lesson05;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        //Task 1: Написать программу по возведению числа в степень с помощью рекурсии.
        System.out.println("2 в степени 24 = " + elevate(2, 24));

        List<Stuff> stuff = new ArrayList<>();
        stuff.add(new Stuff("Кирпич", 10, 2));
        stuff.add(new Stuff("Фляга", 25, 1));
        stuff.add(new Stuff("Коврик", 35, 1));
        stuff.add(new Stuff("Булыжник", 1, 3));
        stuff.add(new Stuff("Спальник", 120, 4));
        stuff.add(new Stuff("Палатка", 1500, 12));

        displayAllStuff(stuff);

        BackPack backPack= new BackPack();
        backPack.getSuperThing(stuff);

        loadStuff2BackPack(backPack, stuff);

        System.out.println("Осталось стаффа:");
        displayAllStuff(stuff);
        System.out.println("-----------------");

        System.out.println("В рюкзак положили: ");
        displayAllStuff(backPack.getStuff());

    }

    private static void loadStuff2BackPack(BackPack bp, List<Stuff> stuff) {
        if (stuff.size() == 0) return;

        int maxPrice = 0;
        int index = 0;
        for (int i = 0; i < stuff.size(); i++) {
            if (stuff.get(i).getPrice() > maxPrice) {
                if (bp.getWeightFull() >= stuff.get(i).getWeight()) {
                    maxPrice = stuff.get(i).getPrice();
                    index = i;
                }
            }
        }

        if (maxPrice > 0) {
            if (bp.addStuff(stuff.get(index))) {
                stuff.remove(index);
                loadStuff2BackPack(bp, stuff);
            }
        } else {
            return;
        }
    }

    private static void displayAllStuff(List<Stuff> stuff) {
        for (Stuff st:stuff) {
            System.out.printf("[%-25s], [%d], [%d]%n", st.getName(), st.getPrice(), st.getWeight());
//            System.out.println();
        }
    }

// Task 1: Написать программу по возведению числа в степень с помощью рекурсии.
// возводим положительное число в положительную степень
    public static int elevate(int value, int times) {
        if (times <= 1) {
            return value;
        }
        return value * elevate(value, times - 1);
    }
}
