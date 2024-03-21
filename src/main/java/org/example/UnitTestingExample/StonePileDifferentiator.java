package org.example.UnitTestingExample;

import java.util.Arrays;

public class StonePileDifferentiator {
    public static int determineMinDifference(int[] weights) {
        Arrays.sort(weights);
        return calculateDifference(weights, 0, 0, 0);
    }

    public static int calculateDifference(int[] weights, int index, int sum1, int sum2) {
        if (index == weights.length) {
            return Math.abs(sum1 - sum2);
        }

        int diff1 = calculateDifference(weights, index + 1, sum1 + weights[index], sum2);

        int diff2 = calculateDifference(weights, index + 1, sum1, sum2 + weights[index]);
        return Math.min(diff1, diff2);
    }
}
