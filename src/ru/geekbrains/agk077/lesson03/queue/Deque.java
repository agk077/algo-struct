package ru.geekbrains.agk077.lesson03.queue;

public interface Deque<E> extends IQueue<E>{
    boolean insertLeft(E value);
    boolean insertRight(E value);

    E removeLeft();
    E removeRight();
}
