package PolylineWithArrayList;

import java.util.*;

/**
 * Created by sam1 on 12.10.16.
 */
public class Polyline {
    private List<Point>points;

    public Polyline(){
        points=new ArrayList<Point>();
    }
    public Polyline(List<Point>points){
        this.points=points;
    }
    public void appendPoint(int x,int y){
        Point newPoint=new Point(x,y);
        points.add(newPoint);
    }
    public void appendPoint(Point point){
        points.add(point);
    }
    public String toString(){
        return  " (" + points.get(0) + ")";
    }
    public double getLegth(){
       return points.size();
    }
}
