package com.cxkun.behavioral.observer.impl;

import com.cxkun.behavioral.observer.Observer;
import com.cxkun.behavioral.observer.Subject;

public class SubjectImpl<T> extends Subject<T> {
    private T state;

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::response);
    }

    @Override
    public T getState() {
        return state;
    }

    @Override
    public void setState(T state) {
        this.state = state;
        notifyObservers();
    }
}
