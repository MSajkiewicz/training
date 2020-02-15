package com.training.training.codewarsTraining.oddOrEven;

public class OddOrEven {
    public static String oddOrEven (int[] array) {
        int sum = 0;
        for(int a : array) {
            sum = sum + a;
        }

        return (sum%2!=0) ? "odd" : "even";
    }
}
