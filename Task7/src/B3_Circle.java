public class B3_Circle {
    private B3_Point center;
    private double radius;

    public B3_Circle() {
        this.center = new B3_Point();
        this.radius = 1.0;
    }
    public B3_Circle(int xCenter, int yCenter, double radius) {
        this.center = new B3_Point(xCenter, yCenter);
        this.radius = radius;
    }
    public B3_Circle(B3_Point center, double radius) {
        this.center = center;
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public B3_Point getCenter() {
        return center;
    }

    public void setCenter(B3_Point center) {
        this.center = center;
    }
    public int getCenterX() {
        return center.getX();
    }
    public void setCenterX(int x) {
        center.getX();
    }
    public int getCenterY() {
        return center.getY();
    }
    public void setCenterY(int y) {
        center.getY();
    }
    public int [] getCenterXY() {
        return center.getXY();
    }
    public void setCenterXY(int x, int y) {
        center.setXY(x,y);
    }

    @Override
    public String toString() {
        return "Circle[center = " + center + ", radius = " + radius + "]";
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getCircumference() {
        return 2.0 * Math.PI * radius;
    }
    public double distance(B3_Circle another) {
        return center.distance(another.center);
    }
}
