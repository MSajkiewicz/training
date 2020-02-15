package com.training.training.codewarsTraining.oddOrEven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddOrEvenTest {

    @Test
    void oddOrEvenTest() {
        assertEquals("even", OddOrEven.oddOrEven(new int[] {0, 0, 2}));
        assertEquals("odd", OddOrEven.oddOrEven(new int[] {0, 1, 2}));
    }
}