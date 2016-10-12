package Interfaces;

/**
 * Created by sam1 on 12.10.16.
 */
public class TestDrive {
    public static void main(String[]args){
        Movable m1 = new MovablePoint(5,6, 10,8);     // upcast
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);

        Movable m2 = new MovableCercle(2, 1, 2, 20,5); // upcast
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);
       // System.out.println(m2.g);


        Movable m3=new MovableRectangle(2,1,2,4,6,7);
        System.out.println(m3);
        m3.moveUP();
    }
}