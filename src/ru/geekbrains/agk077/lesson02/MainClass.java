package ru.geekbrains.agk077.lesson02;

import java.util.Random;

// First round
// Bubble sort took: 29591 ms
// Insert sort took: 3930 ms
// Select sort took: 14150 ms
//
// Second one
// Bubble sort took: 29707 ms
// Insert sort took: 3900 ms
// Select sort took: 9559 ms
//
// Third
// Bubble sort took: 29089 ms
// Insert sort took: 3668 ms
// Select sort took: 9232 ms

public class MainClass {
    public static void main(String[] args) {
        Array<Integer> data = new ArrayImpl<>(100000);
        Array<Integer> data2 = new ArrayImpl<>(100000);
        Array<Integer> data3 = new ArrayImpl<>(100000);

        Random rnd = new Random();

        for (int i = 0; i < 100000; i++) {
            int element = rnd.nextInt();
            data.add(element);
            data2.add(element);
            data3.add(element);
        }

        {
            long timeBefore = System.currentTimeMillis();
            data.sortBubble();
            long timeAfter = System.currentTimeMillis();
            System.out.println("Bubble sort took: " + (timeAfter - timeBefore) + " ms");
        }
        {
            long timeBefore = System.currentTimeMillis();
            data2.sortInsert();
            long timeAfter = System.currentTimeMillis();
            System.out.println("Insert sort took: " + (timeAfter - timeBefore) + " ms");
        }
        {
            long timeBefore = System.currentTimeMillis();
            data3.sortSelect();
            long timeAfter = System.currentTimeMillis();
            System.out.println("Select sort took: " + (timeAfter - timeBefore) + " ms");
        }

    }
}
