package com.cxkun.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject<T> {
    protected final List<Observer> observers = new ArrayList<>();

    public void add(Observer observer) {
        observers.add(observer);
    }

    public void remove(Observer observer) {
        observers.remove(observer);
    }

    public abstract void notifyObservers();

    public abstract T getState();

    public abstract void setState(T state);
}
