public class TestStaff {
    public static void main(String[] args) {
        Staff s1 = new FullTime(1 , "Linda", 300000);
        System.out.println(s1);
        System.out.println("Salary: " + s1.getSalary());
        System.out.println("--------------------");

        Staff s2 = new PartTime(2, "Alex", 6, 20000);
        System.out.println(s2);
        System.out.println("Salary: " + s2.getSalary());
    }
}