package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * calculateクラスのテスト
 */
public class CalculateTest {
    /**
     * sum関数のテスト。
     * {@link Calculate#sum()} メソッドが メンバの配列の合計値を返すことを確認
     */
    @Test
    public void testSum() {
        int[] input = {1, 2, 3, 4, 5};
        int expected = 15;

        Calculate calculate = new Calculate(input);
        assertEquals(expected, calculate.sum());
    }

    /**
     * ave関数のテスト
     * {@link Calculate#ave()} メソッドが メンバの配列の平均値を返すことを確認
     */
    @Test
    public void testAve() {
        int[] input = {1, 2, 3, 4, 5};
        double expected = 3;
        double delta = 0.001;

        Calculate calculate = new Calculate(input);
        assertEquals(expected, calculate.ave(), delta);
    }
}
