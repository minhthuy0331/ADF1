public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String ID, String Name) {
        this.id = ID;
        this.name = Name;
        balance = 0;
    }
    public Account(String ID, String Name, int Balance) {
        this.id = ID;
        this.name = Name;
        this.balance = Balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() { // balance là số tien của mk
        return balance;
    }
    public int credit(int amount) { // amount là số tien muốn rút
        return balance + amount;
    }
    public int debit(int amount) {
       if(amount <= balance) {
           balance = balance - amount;
           System.out.println("Subtract amount from balance");
       }else {
           System.out.println("Amount Exceeded");
       }
       return balance;
    }
    public int transferTo( Account another, int amount) {
        if(amount <=balance) {
            balance = balance - amount;
            another.balance += amount;
            System.out.println("Transfer amount to the given Account");
        }else {
            System.out.println("Amount exceeded");
        }
        return balance;
    }
    public String toString() {
        return "Account [id " + id + ", name = " + name + ", balance = " + balance + "]";
    }

    // Test Account
    public static void main(String[] args) {
        Account objAcc = new Account("M01", "Minh Thuy", 200000);
        Account objAcc2 = new Account("M02", "Linda", 5000);
        System.out.println("ID: " + objAcc.getId());
        System.out.println("Name: " + objAcc.getName());
        System.out.println("Balance: " + objAcc.getBalance());
        System.out.println("Credit: " + objAcc.credit(50000));

        System.out.println("After debit, Amount: " + objAcc.debit(150000));

        System.out.println("-------------------");
        System.out.println("After transfer , Amount: " + objAcc.transferTo(objAcc2, 5000));
        System.out.println(objAcc.toString());
}

}
