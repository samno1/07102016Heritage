package CircleAndCylinder;

/**
 * Created by sam1 on 08.10.16.
 */
public class CylinderTest {
    public static void main (String[] args) {
        // Declare and allocate a new instance of cylinder
        //   with default color, radius, and height
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder:"
                + " radius=" + c1.getRadius()
                + " height=" + c1.getHeight()
                + " base area=" + c1.getArea()
                + " volume=" + c1.getVolume()+" color= "+c1.getColor());


        Cylinder c2 = new Cylinder(10.0);
        System.out.println("Cylinder:radius=" + c2.getRadius()+ " height=" + c2.getHeight()
                + " base area=" + c2.getArea()
                + " volume=" + c2.getVolume()+" color= "+c2.getColor());

        Cylinder c3 = new Cylinder(3.0, 10.0,"black");
        System.out.println("Cylinder:radius=" + c3.getRadius()
                + " height=" + c3.getHeight()
                + " base area=" + c3.getArea()
                + " volume=" + c3.getVolume()+" color= "+c3.getColor());

        c3.setHeight(15);
        System.out.println(c3.getHeight());
        System.out.println("Cylinder:radius=" + c3.getRadius()
                + " height=" + c3.getHeight()
                + " base area=" + c3.getArea()
                + " volume= " + c3.getVolume()+" color= "+c3.getColor());
        System.out.println(c3.getVolume());
        System.out.println(c3.getArea());
        System.out.println(c3);

    }
}
