package com.vaani.hackerrank.algorithms.implementation;

import java.util.*;

public class BirthdayChocolate {
    static int birthday(List<Integer> s, int d, int m) {
        int counter = 0;
        //month is bigger than choclate size
        if (m > s.size()) {
            return counter;
        }


        //if month january
        if (s.size() == 1 && m == 1) {
            return 1;
        }

        int sum = 0;

        for (int i = 0; i < m; i++) {
            sum += s.get(i);
        }

        if (sum == d) {
            counter++;
        }

        for (int i = m; i < s.size(); i++) {
            sum = sum + s.get(i) - s.get(i - m);
            if (sum == d) {
                counter++;
            }
        }

        return counter;

    }
}
