package com.example.designPattern.adapter;

import java.util.Enumeration;
import java.util.Iterator;
//iterator를 enumberation으로 변환
public class IteratorEnumeration implements Enumeration {
    Iterator<?> iterator;

    public IteratorEnumeration(Iterator iterator) {
        this.iterator = iterator;
    }

    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    public Object nextElement() {
        return iterator.next();
    }

}
