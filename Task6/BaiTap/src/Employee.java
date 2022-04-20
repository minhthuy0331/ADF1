public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getName() {
        return "'" + firstName + " "  + lastName + "'";
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary() {
        return salary * 12;
    }
    public int raiseSalary(int percent) {
        percent = percent + 100;
        return this.salary * percent/100;

    }
    public String toString() {
        return "Employee[id = " + id + " ,name = " + getName() + " ,salary " + salary + "]" ;
     }

    // Test Employee
    public static void main(String[] args) {
        Employee objEm = new Employee(1, "Minh", "Thuy", 1000);
        System.out.println("ID: " + objEm.getId());
        System.out.println("First Name: " + objEm.getFirstName());
        System.out.println("Last Name: " + objEm.getLastName());
        System.out.println("Name: " + objEm.getName());
        System.out.println("Salary: " + objEm.getSalary());
        System.out.println("Annul Salary: " + objEm.getAnnualSalary());
        System.out.println(objEm.toString());
        System.out.println("Increasing 20 percent: " + objEm.raiseSalary(20));

        System.out.println("------------------------");
        objEm.setSalary(5000);
        System.out.println("After setSalary: " + objEm.getSalary());
        System.out.println("Annul Salary: " + objEm.getAnnualSalary());
        System.out.println(objEm.toString());
        System.out.println("Increasing 10 percent: " + objEm.raiseSalary(10));
    }
}
