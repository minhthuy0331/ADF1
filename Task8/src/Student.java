public class Student {
    private int RollNo;
    private String name;
    private Classroom myClass;

    public Student(int RollNo, String name) {
        this.RollNo = RollNo;
        this.name = name;
        this.myClass = new Classroom();
    }
    public Student(int RollNo, String name, Classroom myClass) {
        this.RollNo = RollNo;
        this.name = name;
        this.myClass = myClass;
    }

    public String getName() {
        return name;
    }

    public Classroom getMyClass() {
        return myClass;
    }

    public int getRollNo() {
        return RollNo;
    }

    public void setMyClass(Classroom myClass) {
        this.myClass = myClass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        RollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "RollNo=" + RollNo +
                ", name='" + name + '\'' +
                ", myClass=" + myClass +
                '}';
    }


}
