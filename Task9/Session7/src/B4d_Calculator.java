public class B4d_Calculator {
    public static void main(String[] args) {
        B4a_Shape objShape;
        String shape;
        if(args.length == 2) {
            shape = args[0].toLowerCase();
            switch (shape) {
                case "circle" : objShape = new B4b_Circle();
                objShape.calculate(Float.parseFloat(args[1]));
                break;
                case "rectangle": objShape = new B4c_Rectangle();
                objShape.calculate(Float.parseFloat(args[1]));
                break;
            }
        }
        else {
            System.out.println("Usage: javaCalculator<shape- name><value>");
        }
    }
}
