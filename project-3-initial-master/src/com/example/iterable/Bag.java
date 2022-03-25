package com.example.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bag<T> implements Container<T> {

    private ArrayList<T> bag = new ArrayList<T>();

    public boolean isEmpty() {
        return bag.isEmpty();
    }

    public int size() {
        return bag.size();
    }

    public void add(T item) {
        bag.add(item);
    }

    public Iterator<T> iterator() {
        return bag.iterator();

    }
}
