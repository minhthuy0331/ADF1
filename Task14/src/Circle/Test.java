package Circle;
public class Test {
    public static void main(String[] args) {
        Circle c1 = new Cylinder(1.1, 2.2);
        System.out.println(c1.getRadius());
       // System.out.println(c1.getHeight()); không lấy được ở lớp con

        // sẽ lấy ở lớp con khi có lớp con ghi đè các phương thức từ lớp cha
        System.out.println(c1.toString());
        System.out.println(c1.getArea());
    }
}
