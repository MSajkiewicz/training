package com.training.training.codewarsTraining.aNeedleInTheHaystack;

import static java.util.Arrays.stream;

public class ANeedleInTheHaystack {
    public static String findNeedle(Object[] haystack) {
        int result = -1;
        for(int i=0; i<haystack.length; i++){
            if(haystack[i]=="needle"){
                result = i;
            }
         }
        return "found the needle at position " + result;
    }
}
