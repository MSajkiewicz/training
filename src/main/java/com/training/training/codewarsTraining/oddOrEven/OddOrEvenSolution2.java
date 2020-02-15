package com.training.training.codewarsTraining.oddOrEven;

import static java.util.Arrays.stream;

public class OddOrEvenSolution2 {
    public static String oddOrEven (int[] array) {
    return stream(array).sum() % 2 == 0 ? "even" : "odd";
    }
}
