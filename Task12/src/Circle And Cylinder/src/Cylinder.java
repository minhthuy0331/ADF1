public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super(); // goi den class cha la Circle()
        this.height = 1.0;
        System.out.println("Constructed a Cylinder with Cylinder()");
    }

    public Cylinder(double height) {
        super();
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(height)");
    }

    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(height, radius)");
    }

    public Cylinder(double height,double radius,  String color) {
        super(radius, color);
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(height, radius, color)");
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
//    public double getVolume() { // the tich
//        return getArea() * height;  // use Circle's getArea()
//    }
//    @Override
//    public String toString() {
//        return "This is a Cylinder";
//    }
    @Override
    public double getArea() {
        return 2 * Math.PI * getRadius() * height + 2 * super.getArea();
    }
    public double getVolume() {
        return super.getArea()*height;
    }
    @Override
    public String toString() {
        return "Cylinder[" + super.toString() + ", height = " + height + "]";
    }

}
