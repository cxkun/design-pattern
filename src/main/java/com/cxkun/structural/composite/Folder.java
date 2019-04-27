package com.cxkun.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Entry {
    private String name;
    private int size;
    private List<Entry> entries = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Entry entry : entries) {
            size += entry.getSize();
        }
        return size;
    }

    @Override
    public Entry add(Entry entry) {
        entries.add(entry);
        return this;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + name);
        for (Entry entry : entries) {
            entry.printList(prefix + "/" + name);
        }
    }
}
