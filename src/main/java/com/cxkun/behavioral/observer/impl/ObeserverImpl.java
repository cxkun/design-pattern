package com.cxkun.behavioral.observer.impl;

import com.cxkun.behavioral.observer.Observer;
import com.cxkun.behavioral.observer.Subject;

public class ObeserverImpl implements Observer {
    private final Subject<Integer> subject;

    public ObeserverImpl(Subject<Integer> subject) {
        this.subject = subject;
    }

    @Override
    public void response() {
        System.out.println("observer response for subject change, new state is : " + subject.getState());
    }
}
