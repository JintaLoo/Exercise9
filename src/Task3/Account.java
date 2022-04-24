package Task3;

public class Account
{
    public static String owner,accountNumber;
    public static int balance;

    Account(int balance, String owner, String accountNumber) throws NotEnoughMoney {
        Account.balance = balance;
        Account.owner = owner;
        Account.accountNumber = accountNumber;
    }
    Account() {
        super();
    }

    public String getOwner() {
        return this.owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public int getBalance() {
        return this.balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public String getAccountNumber() {
        return this.accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public static void Cal(int withdraw) {
        if(balance > withdraw ) {
            System.out.println("Withdraw : " + withdraw);
            System.out.println("Total balance : " + (balance -= withdraw));
        }
        else
            System.out.println("Total balance : " +balance);
    }
}

class NotEnoughMoney extends Exception {
    public NotEnoughMoney() {
        super("Not enough money.");
    }

    public NotEnoughMoney(String message) {
        super(message);
    }
}