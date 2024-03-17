package org.example.Intervals;

public class OverlapChecker {
    public static boolean isOverlap(Interval a, Interval b) {
        return isOverlapping(a, b) || isOverlapping(b, a);
    }

    private static boolean isOverlapping(Interval a, Interval b) {
        return isInRange(a.getStart(), b) || isInRange(a.getEnd(), b);
    }

    private static boolean isInRange(int point, Interval interval) {
        return point >= interval.getStart() && point <= interval.getEnd();
    }
}
