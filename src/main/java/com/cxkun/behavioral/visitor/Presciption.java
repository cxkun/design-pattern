package com.cxkun.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * ObjectStruct
 */
public class Presciption {
    List<Medicine> list = new ArrayList<>();
    public void accept(Visitor visitor) {
        list.forEach(v -> v.accept(visitor));
    }

    public void add(Medicine medicine) {
        list.add(medicine);
    }

    public void remove(Medicine medicine) {
        list.remove(medicine);
    }
}
