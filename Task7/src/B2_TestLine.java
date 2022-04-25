import java.util.Arrays;
public class B2_TestLine {
    public static void main(String[] args) {
        B2_Line line1 = new B2_Line(4,2,1,4);
        System.out.println(line1.getLength());
        System.out.println(line1.getBeginX());
        System.out.println(line1.getEndX());
        line1.setBeginXY(2,5);
        System.out.println(Arrays.toString(line1.getBeginXY()));
    }
}
