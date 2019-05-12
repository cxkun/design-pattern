package com.cxkun.behavioral.visitor.impl;

import com.cxkun.behavioral.visitor.Visitor;

public class Charger implements Visitor {
    @Override
    public void visit(MedicineA medicineA) {
        System.out.println("划价者为" + medicineA.getName() + "划价: " + medicineA.getPrice());
    }

    @Override
    public void visit(MedicinaB medicineB) {
        System.out.println("划价者为" + medicineB.getName() + "划价: " + medicineB.getPrice());
    }
}
