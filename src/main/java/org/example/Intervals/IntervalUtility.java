package org.example.Intervals;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class IntervalUtility {
    public static List<Interval> parseAndSortIntervals(int[][] intervalsArray) {
        ParserInterval parserInterval = new ParserInterval();
        List<Interval> intervals = parserInterval.parserComplexInterval(intervalsArray);
        intervals.sort(Comparator.comparingInt(Interval::getStart));
        return intervals;
    }

    public static List<Interval> mergeOverlappingIntervals(List<Interval> intervals) {
        OverlapChecker overlapChecker = new OverlapChecker();
        IntervalMerger intervalFusion = new IntervalMerger();

        List<Interval> mergedIntervals = new ArrayList<>();

        for (Interval interval : intervals) {
            boolean merged = false;
            for (int i = 0; i < mergedIntervals.size(); i++) {
                Interval mergedInterval = mergedIntervals.get(i);
                if (overlapChecker.isOverlap(mergedInterval, interval)) {
                    Interval newInterval = intervalFusion.merge(mergedInterval, interval);
                    mergedIntervals.set(i, newInterval);
                    merged = true;
                    break;
                }
            }
            if (!merged) {
                mergedIntervals.add(interval);
            }
        }
        return mergedIntervals;
    }

}
