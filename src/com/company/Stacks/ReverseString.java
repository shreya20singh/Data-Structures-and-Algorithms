package com.company.Stacks;

import java.util.Arrays;
import java.util.Stack;

public class ReverseString {

//    public String reverseString(String str){
//        char[] inputStringArray = str.toCharArray();
//        int size = inputStringArray.length;
//        Stack<Character> stringStack = new Stack<>();
//        for (int i = 0; i < size; i++)
//           stringStack.push(inputStringArray[i]);
//        char reverseString[] = new char[size];
//        for (int i = 0; i< size; i++)
//        reverseString[i] = stringStack.pop();
//        return new ReverseString().toString(reverseString);
//    }

    public String reverseString(String str){
        if(str == null)
            throw new IllegalArgumentException();
        Stack<Character> stringStack = new Stack<>();
        for (char ch: str.toCharArray())
            stringStack.push(ch);

        StringBuffer reversed = new StringBuffer();
        while (!stringStack.isEmpty())
            reversed.append(stringStack.pop());

        return reversed.toString();
    }
//    public static String toString(char a[]) {
//        return new String(a);
//    }
}
