package ru.geekbrains.agk077.lesson03;

import ru.geekbrains.agk077.lesson03.queue.Deque;
import ru.geekbrains.agk077.lesson03.queue.DequeImpl;
import ru.geekbrains.agk077.lesson03.stack.IStack;
import ru.geekbrains.agk077.lesson03.stack.StackImpl;

public class MainClass {
    public static void main(String[] args) {
        String testString = "0123456789";
        System.out.println(testString);

        // Task 1: Reverse string
        IStack<Character> charStack = new StackImpl<>(testString.length());

        for (int i = 0; i < testString.length(); i++) {
            charStack.push(testString.charAt(i));
        }

        while (!charStack.isEmpty()) {
            System.out.print(charStack.pop());
        }
        System.out.println();

        // Task 2: Deque
        Deque<Integer> dq = new DequeImpl<>(4);
        insertRight(dq, 1);
        insertRight(dq,2);
        insertLeft(dq, 3);
        insertLeft(dq, 4);

        removeLeft(dq);
        removeRight(dq);

        while (!dq.isEmpty()) {
            System.out.println(dq.removeRight());
        }

    }

    private static <E> void insertRight(Deque<E> deq, E value) {
        if (!deq.isFull()) {
            deq.insertRight(value);
        }
    }
    private static <E> void insertLeft(Deque<E> deq, E value){
        if (!deq.isFull()) {
            deq.insertLeft(value);
        }
    }

    private static <E> void removeRight(Deque<E> deq) {
        if (!deq.isEmpty()) {
            deq.removeRight();
        }
    }
    private static <E> void removeLeft(Deque<E> deq) {
        if (!deq.isEmpty()) {
            deq.removeLeft();
        }
    }
}
