package InforPerson;
public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student("Alex", 19, 1.65, "FPT");
        s1.getInfo();
        System.out.println("-----------------");

        // getter and setter
        s1.setName("Lina");
        s1.setAge(20);
        s1.setHeight(1.6);
        s1.setUniversityName("Thang Long");
        s1.getInfo();
    }
}
