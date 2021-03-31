package com.company.ArrayExercises;

import java.util.HashMap;
import java.util.Map;

public class StringsPermutation {

    String sort(String str){
        char[] content = str.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }

    public boolean checkStringPermutationsViaSorting(String str1, String str2){
        if(str1.length()!=str2.length())
            return false;
        String sortedFirstString = sort(str1);
        String sortedSecondString = sort(str2);
        if(sortedFirstString.equals(sortedSecondString))
            return true;
        return false;
    }
}
