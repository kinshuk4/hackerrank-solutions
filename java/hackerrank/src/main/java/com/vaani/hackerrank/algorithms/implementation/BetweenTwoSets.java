package com.vaani.hackerrank.algorithms.implementation;

import java.util.*;
import com.vaani.dsa.algo.numerical.LcmGcdOfArray;
import com.vaani.dsa.ds.utils.ArrayUtils;

import static com.vaani.dsa.algo.numerical.LcmGcdOfArray.gcd;
import static com.vaani.dsa.algo.numerical.LcmGcdOfArray.lcm;
import static com.vaani.dsa.ds.utils.ArrayUtils.listToPrimitiveArray;

//https://www.hackerrank.com/challenges/between-two-sets/forum
// https://www.hackerrank.com/challenges/between-two-sets/forum
public class BetweenTwoSets {
    /*
    O(n log(n)) solution.
    1. find the LCM of all the integers of array A.
    2. find the GCD of all the integers of array B.
    3. Count the number of multiples of LCM that evenly divides the GCD.
     */
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int f = lcm(listToPrimitiveArray(a));
        int l = gcd(listToPrimitiveArray(b));
        int count = 0;
        for(int i = f, j =2; i<=l; i=f*j,j++){
            if(l%i==0){ count++;}
        }

        return count;

    }



}
