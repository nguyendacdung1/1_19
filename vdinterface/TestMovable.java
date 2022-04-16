package vdinterface;

public class TestMovable {
    public static void main(String[] args) {
        MovablePoint m1 = new MovablePoint(3,4);
        System.out.println(m1);
        m1.moveUp();
        System.out.println(m1);
        m1.moveDown();
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
        m1.moveRight();
        System.out.println(m1);

        Movable m2 = new MovablePoint(1,2);
        m2.moveUp();
        System.out.println(m2);

        MovablePoint m3 = (MovablePoint)m2;
        System.out.println(m3);
        m3.moveDown();
        System.out.println(m3);
    }
}
