package com.vaani.hackerrank.algorithms.implementation;

import org.junit.Assert;

public class BreakingTheRecords {
    static int[] breakingRecords(int[] scores) {
        int max = scores[0];
        int min = scores[0];

        int minChange = 0;
        int maxChange = 0;

        for (int i = 1; i < scores.length; i++) {
            int currScore = scores[i];
            if (currScore > max) {
                max = currScore;
                maxChange++;
            } else if (currScore < min) {
                min = currScore;
                minChange++;
            }
        }

        return new int[]{maxChange, minChange};

    }

    public static void main(String[] args) {
        Assert.assertEquals(new int[]{4, 0}, breakingRecords(new int[]{3,4,21,36,10,28,35,5,24,42}));
        Assert.assertArrayEquals(new int[]{2,4}, breakingRecords(new int[]{10,5,20,20,4,5,2,25,1}));
    }
}
