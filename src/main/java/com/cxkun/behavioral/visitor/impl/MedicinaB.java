package com.cxkun.behavioral.visitor.impl;

import com.cxkun.behavioral.visitor.Medicine;
import com.cxkun.behavioral.visitor.Visitor;

public class MedicinaB extends Medicine {
    public MedicinaB(String name, double price) {
        super(name, price);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
