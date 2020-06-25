package com.vaani.hackerrank.misc;

/**
 *
 */
public class GenericTest<T extends Comparable> {
    public void run(T first, T second) {
        System.out.println(first.compareTo(second));
    }
}
