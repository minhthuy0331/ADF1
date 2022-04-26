class B4b_Circle extends B4a_Shape {
    float area;

    @Override
    void calculate(float rad) {
        area = getPI() * rad * rad;
        System.out.println("Area of circle is: " + area);
    }

}


