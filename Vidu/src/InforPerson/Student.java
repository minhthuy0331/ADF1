package InforPerson;
public class Student extends Person{
    private String universityName;

    public Student(String name, int age, double height, String universityName) {
        super(name, age, height);
        this.universityName = universityName;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public void getInfo() {
        super.getInfo();
        System.out.println("University Name: "+ universityName);
    }


}