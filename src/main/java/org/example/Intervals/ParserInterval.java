package org.example.Intervals;

import java.util.ArrayList;
import java.util.List;

public class ParserInterval {
    public Interval parserSimpleInterval(int[] simpleInterval){
        return new Interval(simpleInterval[0], simpleInterval[1]);
    }

    public List<Interval> parserComplexInterval(int[][] complexInterval){
        List<Interval> list = new ArrayList<>();
        for (int [] i : complexInterval){
            list.add(parserSimpleInterval(i));
        }
        return list;
    }
}
