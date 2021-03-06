public class TestPoint2DPoint3D {
    public static void main(String[] args) {
        // Test Point2D
        Point2D p2a = new Point2D(1,2);
        System.out.println(p2a); // toString

        Point2D p2b = new Point2D(); // default constructor
        System.out.println(p2b);

        // Test setter and getter
        p2a.setX(3);
        p2a.setY(4);
        System.out.println(p2a);
        System.out.println("X is: " + p2a.getX());
        System.out.println("Y is: " + p2a.getY());
        System.out.println("---------------");
        // Test Point3D
        Point3D p3a = new Point3D(11,12,13);
        System.out.println(p3a);
        Point3D p3b = new Point3D(); //default constructor
        System.out.println(p3b);
        // Test getter and setter
        p3a.setX(21);
        p3a.setY(22);
        p3a.setZ(23);
        System.out.println(p3a);
        System.out.println("X is: " + p3a.getX());
        System.out.println("Y is: " + p3a.getY());
        System.out.println("Z is: " + p3a.getZ());
    }
}
