import java.awt.*;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Rectangle("red", 4, 5);
        System.out.println(s1);
        System.out.println("Color is "+s1.getColor()+" .Area is " + s1.getArea());

        Shape s2 = new Rectangle("blue", 4, 5);
        System.out.println(s2);
        System.out.println("Color is "+s2.getColor()+" .Area is" + s2.getArea());

        Shape S4 = new Triangle("Blue",6,7);
        System.out.println(S4);
        System.out.println("Color is: "+S4.getColor()+" .Area is "+ S4.getArea());

//        Shape s3 = new Shape("green");
//        System.out.println(s3);
    }
}
