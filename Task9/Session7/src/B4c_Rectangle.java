package abstractdemo;
class B4c_Rectangle extends B4a_Shape {
    float perimeter;
    float length = 10;

    @Override
    void calculate(float width) {
        perimeter = 2 * (length + width); // chu vi hcn
        System.out.println("Perimeter of the Rectangle is: " + perimeter);
    }
}