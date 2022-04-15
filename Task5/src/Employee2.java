public class Employee2 {
    // Khai bao bien mac dinh
    int empID;
    String empName;

    // Khai bao bien voi private
    private String SSN; // SSN: social security number
    protected String empDesign;

    public Employee2(int ID, String name) {
        empID = ID;
        empName = name;
    }
    public String getSSN() {
        return SSN;
    }
    // Sets the value of SSN
    public void setSSN(String ssn) {
        SSN = ssn;
    }
    // Set the value of Designation
    public void setEmpDesign(String design) {
        empDesign = design;
    }
    // Display
    public void display() {
        System.out.println("Employee ID is " + empID);
        System.out.println("Employee name is " + empName);
        System.out.println("Designation is " + empDesign);
        System.out.println("SSN is " + SSN);
    }

    public static void main(String[] args) {
        Employee2 objEmp1 = new Employee2(1200, "Roger Stevens");
        objEmp1.empDesign = "Manager";
        objEmp1.SSN = "281-72-3873";
        objEmp1.display();


    }
}
