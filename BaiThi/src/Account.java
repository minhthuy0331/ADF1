import java.util.Scanner;

public class Account {
    private String customerCode;
    private String customerName;
    private int accNumber;
    private long amount = 0;

    public void input(){
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Enter Code: ");
            customerCode = in.nextLine();
            System.out.println("Enter Name: ");
            customerName = in.nextLine();
            System.out.println("Enter Account number: ");
            accNumber = in.nextInt();
            System.out.println("Enter Amount: ");
            amount = in.nextLong();
        } while (accNumber<100000 || accNumber > 101000 || customerCode.length() < 5 );
    }
    public void depositAndWithdraw(){
        long money;
        int type;
        Scanner in = new Scanner(System.in);
        type = in.nextInt();
        System.out.println("Enter money: ");
        money = in.nextLong();
        if (type == 0){
            amount += money;
            System.out.println("Your amount: "+ amount);
        }

        if (type == 1){
            if (money <= amount){
                amount -= money;
                System.out.println("Amount: "+ amount);
            }
            else if (money > amount) {
                System.out.println("Non-sufficient funds");
            }
        }

        System.out.println("------------------------");
    }

    @Override
    public String toString() {
        return "Account: [ Code: "+ customerCode+", Name: "+customerName+", Account number: "+accNumber+", Amount: "+amount + "]";
    }

}
