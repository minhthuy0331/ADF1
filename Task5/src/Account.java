public class Account {
    private int accountID;
    private String holderName;
    private String accountType;

    {
        accountID = 100;
        holderName = "John Anderson";
        accountType = "Savings";
    }
    public void displayAccountDetails() {
        System.out.println("Account Details");
        System.out.println("===============");
        System.out.println("Account ID: " + accountID + "\nAccountType:" + accountType);
    }
    // TestInitializationBlock
    public static void main(String[] args) {
        Account objAccount = new Account();
        objAccount.displayAccountDetails();
    }
}
