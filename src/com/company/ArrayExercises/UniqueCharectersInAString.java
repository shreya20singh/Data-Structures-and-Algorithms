package com.company.ArrayExercises;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharectersInAString {

    public boolean checkStringForUniqueCharecters(String str){
        char[] inputArray = str.toCharArray();
        Map<Character, Integer> inputMap = new HashMap();
        for(int i=0; i<inputArray.length; i++)
        {
            if(inputMap.get(inputArray[i])!= null)
                return false;
            inputMap.put(inputArray[i],1);
        }
        return true;
    }
}
