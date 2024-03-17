package org.example.Intervals;

import java.util.List;

public class SumIntervals {
    public static int sumIntervals(int[][] intervalsArray) {
        List<Interval> mergedIntervals = IntervalUtility.mergeOverlappingIntervals(IntervalUtility.parseAndSortIntervals(intervalsArray));
        return calculateTotalLength(mergedIntervals);
    }

    private static int calculateTotalLength(List<Interval> intervals) {
        int totalLength = 0;
        for (Interval interval : intervals) {
            totalLength += interval.length();
        }
        return totalLength;
    }
    public static void print(int [][] intervals){
        System.out.println(sumIntervals(intervals));
    }
}
