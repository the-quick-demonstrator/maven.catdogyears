package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class YearCalculatorTest {

    private void test(int input, int... expected) {
        // given
        YearCalculator yearCalculator = new YearCalculator();

        // when
        int[] actual = yearCalculator.calculate(input);

        // then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test1() {
        test(10, 10, 56, 64);
    }

    @Test
    public void test2() {
        test(1, 1, 15, 15);
    }

    @Test
    public void test3() {
        test(2, 2, 24, 24);
    }
}
