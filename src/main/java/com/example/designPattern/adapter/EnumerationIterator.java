package com.example.designPattern.adapter;


import java.util.Enumeration;
import java.util.Iterator;
//enumeration 을 iterator로 변환하는 adpater
public class EnumerationIterator implements Iterator<Object> {
    Enumeration<?> enumeration;
    public EnumerationIterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    public Object next() {
        return enumeration.nextElement();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
