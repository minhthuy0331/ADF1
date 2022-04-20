public class Student {
    private int rollNo;
    private String name;

    public Student() {
        rollNo = 1;
        name = "Thuy";
    }
//    public Student(int r, String n) {
//        rollNo = r;
//        name = n;
//    }

//    @Override
//    public String toString() {
//        return "Student [" + rollNo + " : " + name + "]" ;
//    }

    public static void main(String[] args) {
        Student stud1 = new Student();
        System.out.println(stud1);
    }
}
