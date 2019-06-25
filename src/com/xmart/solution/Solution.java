package com.xmart.solution;

public class Solution {
    public static void main(String[] args) {
        int prices[] = {1,5,8,9,10};
        System.out.println(maximumRevenue(5, prices));
    }

    static int maximumRevenue(int n, int[] prices) {
        if (prices.length == 0)
            return 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max,prices[i] + maximumRevenue(n-1-i, prices));
        }
        return max;
    }
}
