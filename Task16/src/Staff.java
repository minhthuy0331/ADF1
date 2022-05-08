public class Staff {
    private int ID;
    private String name;

    public Staff(){
        this.ID = 1;
        this.name = " Thuy";
    }
    public Staff(int id, String name){
        this.ID = id;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    @Override
    public String toString() {
        return "ID= " + ID + ", name= " + name;
    }
    public double getSalary(){
        System.out.println("Cannot calculate salary");
        return 0;
    }
}
