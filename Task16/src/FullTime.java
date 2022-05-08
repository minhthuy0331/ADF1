public class FullTime extends Staff{
    private int money;
    public FullTime(){
        super();
        this.money = money;
    }
    public FullTime(int id, String name,int money){
        super(id, name);
        this.money = money;
    }
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    @Override
    public double getSalary() {
        return this.money;
    }
    @Override
    public String toString() {
        return "FullTime: " + super.toString() + ", money = " + money ;
    }
}