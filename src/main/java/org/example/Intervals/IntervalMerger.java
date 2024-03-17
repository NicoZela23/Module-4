package org.example.Intervals;

public class IntervalMerger implements IMerger {
    @Override
    public Interval merge(Interval a, Interval b) {
        return new Interval(Math.min(a.getStart(), b.getStart()), Math.max(a.getEnd(), b.getEnd()));
    }
}
