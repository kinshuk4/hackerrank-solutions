package com.vaani.hackerrank;

import java.util.Arrays;

/**
 *
 */
public class IsUnique {
    public boolean verify(String input) {
        if(input == null || input.isEmpty() || input.length() == 1) {
            return true;
        }

        char[] word = input.toCharArray();
        Arrays.sort(word);

        for(int index = 1; index < word.length; index++) {
            if(word[index - 1] == word[index]) {
                return false;
            }
        }

        return true;
    }
}
