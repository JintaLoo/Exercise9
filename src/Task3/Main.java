package Task3;

public class Main {
    public static void main(String[] args) throws NotEnoughMoney {
        int withdraw = 20, balance = 10;
        Account a = new Account(balance,"Kanisorn","55477");

        try
        {
            if (balance >= withdraw)
                a.Cal(withdraw);
            else
                throw new NotEnoughMoney();
        } catch (NotEnoughMoney e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            a.Cal(withdraw);
        }
    }
}
