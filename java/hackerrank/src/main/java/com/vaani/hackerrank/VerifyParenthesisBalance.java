package com.vaani.hackerrank;

import java.util.Stack;

/**
 *
 */
public class VerifyParenthesisBalance {
    public boolean isBalanced(String sentence) {
        Stack<Character> characters = new Stack<>();

        char[] elements = sentence.toCharArray();
        for(int index = 0; index < elements.length; index++) {
            if(elements[index] == '(' || elements[index] == '[' || elements[index] == '{') {
                characters.push(elements[index]);
            } else if(elements[index] == ')') {
                if(!characters.isEmpty() && characters.peek() == '('){
                    characters.pop();
                } else {
                    return false;
                }
            } else if(elements[index] == ']') {
                if(!characters.isEmpty() && characters.peek() == '['){
                    characters.pop();
                } else {
                    return false;
                }
            } else if(elements[index] == '}') {
                if(!characters.isEmpty() && characters.peek() == '{'){
                    characters.pop();
                } else {
                    return false;
                }
            }
        }

        if(characters.isEmpty()) {
            return true;
        }
        return false;
    }
}
