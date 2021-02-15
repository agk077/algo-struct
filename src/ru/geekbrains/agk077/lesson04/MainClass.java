package ru.geekbrains.agk077.lesson04;

public class MainClass {
    public static void main(String[] args) {
        LinkedList<Integer> list = new SimpleLinkedListImpl<>();
        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);

        for (Integer value : list) {
            System.out.println(value);
        }

        System.out.println("-----------");
    }
}
