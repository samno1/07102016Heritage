package CircleAndCylinder;

/**
 * Created by sam1 on 08.10.16.
 */
public class Cylinder extends Circle {
    private double height;

    public Cylinder(){
        super();
        height=1.0;
    }
    public Cylinder(double height){
        super();
        this.height=height;
    }
    public Cylinder(double radius, double height){
        super(radius,"");
        this.height=height;
    }
    public Cylinder(double radius, double height,String color){
        super(radius,color);
        this.height=height;
    }
    public double getHeight(){
        return height;
    }
    public  void  setHeight(double height){
        this.height=height;
    }
    public double getVolume(){
        return getArea()*height;
    }
    @Override
    public double getArea(){
        return 2*Math.PI*getRadius()*height;
    }

    @Override
    public String toString(){
        return "Cylinder: subclass of " + super.toString()+" height=" + height;
    }

}
