package com.cxkun.behavioral.visitor.impl;

import com.cxkun.behavioral.visitor.Visitor;

/**
 * 药房工作者
 */
public class WorkerOfPharmacy implements Visitor {
    @Override
    public void visit(MedicineA medicineA) {
        System.out.println("药房工作者取药: " + medicineA.getName());
    }

    @Override
    public void visit(MedicinaB medicinaB) {
        System.out.println("药房工作者取药：" + medicinaB.getName());
    }
}
