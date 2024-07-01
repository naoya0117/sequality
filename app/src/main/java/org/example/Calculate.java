package org.example;

public class Calculate {
    int[] values;

    /**
     * コンストラクタ
     * @param values 整数の配列
     */
    public Calculate(int[] values) {
        this.values = values;
    }

    /**
     * @return 配列の合計値
     */
    public int sum() {
        int sum = 0;

        for (int value : this.values) {
            sum += value;
        }

        return sum;
    }

    /**
     * @return 配列の平均値
     */
    public double ave() {
        return (double) this.sum() / this.values.length;
    }
}
