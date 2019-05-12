package com.cxkun.behavioral.visitor;

import com.cxkun.behavioral.visitor.impl.MedicinaB;
import com.cxkun.behavioral.visitor.impl.MedicineA;

public interface Visitor {
    void visit(MedicineA medicineA);
    void visit(MedicinaB medicinaB);
}
