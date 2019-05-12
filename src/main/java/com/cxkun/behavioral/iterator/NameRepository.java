package com.cxkun.behavioral.iterator;

public class NameRepository implements Container {
    String[] names = {"a", "john", "marry", "b"};

    @Override
    public Iterator getIterator() {
        return new NameRepoIterator();
    }

    public class NameRepoIterator implements Iterator {
        int index = 0;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            Object obj = names[index];
            index ++;
            return obj;
        }
    }
}
