public class TestStudent {
    public static void main(String[] args) {
        Student Stud = new Student(1, "Nguyen Van A", new Classroom(1, "T2109A") );
        System.out.println(Stud.toString());
        Stud.getMyClass();
        System.out.println(Stud.getMyClass());
    }

}
