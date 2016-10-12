package Shapes;

/**
 * Created by sam1 on 12.10.16.
 */
public abstract class Shape {
    protected String color="red";
    protected   boolean filled=true;

    public Shape(){
        this.color=color;
        this.filled=false;
    }

    public Shape(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }
    public String getColor(){
        return color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setFilled(boolean filled){
        this.filled=filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public  String toString(){

        String a;
        if (filled) a="filled";
        else a=" not filled";

        return "Shape with "+color+" color and is "+a;
    }


}
