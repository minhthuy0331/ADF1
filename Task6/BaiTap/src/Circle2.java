public class Circle2 {
    private double radius;

    public Circle2() {
        radius = 1.0;
    }
    public Circle2(double r) {
        this.radius = r;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double r) {
        this.radius = r;
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }
    public double getCircumference() {
        return 2 * Math.PI * (Math.pow(radius,2));
    }
    public String toString() {
        return "Circle[radius= " + radius + "]";
    }

    // Test TestCircle2
    public static void main(String[] args) {
        // Constructor 1
        Circle2 c1 = new Circle2();
        System.out.println("The circle has radius of: " + c1.getRadius() + " and area of " + c1.getArea());
        System.out.println("The circle has circumference of " + c1.getCircumference());
        c1.setRadius(2.0);
        System.out.println("After SetRadius,The circle has radius of: " + c1.getRadius() + " and area of " + c1.getArea());
        System.out.println(c1.toString());

        System.out.println("-----------");
        // Constructor 2
        Circle2 c2 = new Circle2(3.0);
        System.out.println("The circle 2 has radius of: " + c2.getRadius() + " and area of " + c2.getArea());
        System.out.println("The circle 2 has circumference of " + c2.getCircumference());
        c2.setRadius(4.0);
        System.out.println("After SetRadius,The circle 2 has radius of: " + c2.getRadius() + " and area of " + c2.getArea());
        System.out.println(c2.toString());
    }
}
