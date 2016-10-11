package Shapes;

/**
 * Created by sam1 on 12.10.16.
 */
public class Rectangle extends Shape{
    private double width=1.0;
    private double length=1.0;

    public Rectangle(){
        super();
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width,double length){
        super();
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width,double length,String color,boolean filled){
        super(color,filled);
        this.width=width;
        this.length=length;
    }
    public double getWidth(){
        return width;
    }
    public  void setWidth(double width){
        this.width=width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length=length;
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return width+length*2;
    }
    @Override
    public String toString(){
        return " Rectangle[width= "+width+"and length="+length+"] which is subclass of "+super.toString();
    }

}
