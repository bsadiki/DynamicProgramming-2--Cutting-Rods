package com.xmart.solution;

public class Solution {
    public static void main(String[] args) {
        int prices[] = {1, 5, 8, 9, 10};
        System.out.println(maximumRevenue(5, prices));
    }

    private static int maximumRevenue(int n, int[] prices) {
        if (prices.length == 0)
            return 0;
        int[] maxForEachN = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            int maxForI = 0;
            for (int j = 0; j < i; j++) {
                maxForI = Math.max(maxForI, prices[j] + maxForEachN[i - 1 - j]);
            }
            maxForEachN[i] = maxForI;
        }
        return maxForEachN[n];
    }
}
