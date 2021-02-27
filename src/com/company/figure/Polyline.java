package com.company.figure;

import com.company.Mathobj;
import com.company.special.Point;

import java.awt.*;
import java.util.ArrayList;

public class Polyline extends Mathobj {
    private ArrayList<com.company.special.Point> points = new ArrayList<>();
public Polyline(){

}
public void addPoint(Point po){
    points.add(po);
}
    protected int[] getXs(){
        return points.stream().mapToInt((s) -> s.x).toArray();
    }

    protected int[] getYs(){
        return points.stream().mapToInt((s) -> s.y).toArray();
    }
    public int getPointsCount(){
        return points.size();
    }
    @Override
    public void draw(Graphics g){
        g.setColor(getBorderColor());
        g.drawPolyline(getXs(), getYs(), getPointsCount());//Stream java 8
        System.out.println(getPointsCount());
    }
}
