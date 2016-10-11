package Shapes;

/**
 * Created by sam1 on 12.10.16.
 */
public class Circle extends Shape {
    private double radius;
    public Circle(){
        super();
        radius=1.0;
    }
    public Circle(double radius){
        super();
        this.radius=radius;
    }
    public Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius=radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getPerimeter(){
        return radius*2*Math.PI;
    }
    @Override
    public String toString(){
        return " Circle[radius= "+radius+"] which is subclass of "+super.toString();
    }
}
