package com.company.figure;

import com.company.special.Point;

public class Line extends Polyline {
    public Line(Point p){
        addPoint(p);
        addPoint(p);
    }

    public Line(Point a, Point b){
        addPoint(a);
        addPoint(b);
    }


}
