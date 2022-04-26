class B3b_PartTimeEmployee extends B3a_Employee {
    String shift;

    public B3b_PartTimeEmployee(String id, String name, int sal, String shift) {
        super(id, name, sal);
        this.shift = shift;
    }
    public void displayDetails() {
        calcCommission(12);
        super.displayDetails();
        System.out.println("Working shift: " + shift);
    }
    // EmployeeDetails
    public static void main(String[] args) {
        B3a_Employee objEmp = new B3a_Employee("E001", "Maria Nemeth", 40000);
        objEmp.calcCommission(20000F);
        objEmp.displayDetails();
        System.out.println("-----------------------");
        B3a_Employee objEmp1 = new B3b_PartTimeEmployee("E002", "Rob Smith", 30000, "Day");
        objEmp1.displayDetails();
    }


}
