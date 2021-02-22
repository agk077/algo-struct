package ru.geekbrains.agk077.lesson03.queue;

public interface IQueue<E> {

    boolean insert(E value);

    E remove();

    E peekHead();

    int size();

    boolean isEmpty();

    boolean isFull();

}
