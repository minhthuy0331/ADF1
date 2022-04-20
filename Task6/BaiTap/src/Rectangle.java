public class Rectangle {  // hinh chu nhat
    private float length;
    private float width;

    public Rectangle() {
        length = 1.0f;
        width = 1.0f;
    }
    public Rectangle(float Length, float Width) {
        this.length = Length;
        this.width = Width;
    }
    public float getLength() {
        return this.length;
    }
    public void setLength(float Length) {
        this.length = Length;
    }
    public float getWidth() {
        return this.width;
    }
    public void setWidth(float Width) {
        this.width = Width;
    }
    public double getArea() {
        return length * width ;
    }
    public double getPerimeter() { // lấy chu vi
        return (length + width) * 2;
    }
    public String toString() {
        return "Rectangle [length = " + length + " width = " + width + "]";
    }

    // Test Rectangle
    public static void main(String[] args) {
        Rectangle Rec = new Rectangle();
        System.out.println("Length: " + Rec.getLength());
        Rec.setLength(5.0f);
        System.out.println("After setLength: " + Rec.getLength());

        System.out.println("-------------");
        System.out.println("Width: " + Rec.getWidth());
        Rec.setWidth(4.0f);
        System.out.println("After setWidth: " + Rec.getWidth());

        System.out.println("------------");
        System.out.println("Area: " + Rec.getArea());
        System.out.println("Perimeter:" + Rec.getPerimeter());
        System.out.println(Rec.toString());
    }
}
