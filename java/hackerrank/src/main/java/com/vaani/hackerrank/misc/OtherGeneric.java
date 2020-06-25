package com.vaani.hackerrank.misc;

/**
 *
 */
public class OtherGeneric {

    public <T> void run(T item) {
        System.out.println(item.toString());
    }

    public <T extends Comparable> int getGreatherThan(T[] array, T element) {
        return array[0].compareTo(element);
    }

    public static void main(String[] args) {
        OtherGeneric service = new OtherGeneric();
        service.run(1);
    }
}
