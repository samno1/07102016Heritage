package Shapes;

import CircleAndCylinder.*;

/**
 * Created by sam1 on 12.10.16.
 */
public class TestDridve {
    public static void main(String[]args){
        Shape shape = new Shape();
        System.out.println(shape);


        Circle c1=new Circle();
        System.out.println(c1);
        c1.setFilled(true);
        c1.setRadius(5);
        System.out.println(c1);
        System.out.println("area="+c1.getArea()+" perimeter="+c1.getPerimeter());
    }
}
