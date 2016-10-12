package Shapes;

import CircleAndCylinder.*;
import CircleAndCylinder.Cylinder;

/**
 * Created by sam1 on 12.10.16.
 */
public class TestDridve {
    public static void main(String[]args){
        Shape shape = new Shape();
        System.out.println(shape);


        Circle c1=new Circle();
        System.out.println("");
        c1.setFilled(true);
        c1.setRadius(5);
        System.out.println(c1);
        System.out.println("area="+c1.getArea()+" perimeter="+c1.getPerimeter());

        Rectangle r=new Rectangle(5,10,"black",true);
        System.out.println("\n"+r);
        System.out.println("area="+r.getArea()+" perimeter="+r.getPerimeter());

        Square s=new Square(5);
        System.out.println("\n"+s);
        s.setSide(5);
        s.setColor("yellow");
        System.out.println("area="+s.getArea()+" perimeter="+s.getPerimeter());

        Cylinder cc = new Cylinder(5,5,"White");
        System.out.println("\n"+cc);
        System.out.println(cc.getArea());

    }
}
