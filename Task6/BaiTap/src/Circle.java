public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }
    public Circle(double r) {
        this.radius = r;
        this.color = "red";
    }
    public  Circle(double r, String c) {
        this.radius = r;
        this.color = c;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }
    public  String getColor() {
        return color;
    }
    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }
    public void setColor(String newColor) {
        this.color = newColor;
    }
    public String toString() {
        return "Circle[ radius= " + radius + " color= " + color +"]";
    }
    // Test TestCircle
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea());
        Circle c2 = new Circle(2.0);
        System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c2.getArea());
        Circle c3  = new Circle(5.0);
        System.out.println(c3.toString());
    }
}
