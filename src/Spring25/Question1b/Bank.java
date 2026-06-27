package Spring25.Question1b;

import Fall24.Question1.B;

public class Bank {
    private int balance;
    Bank(int balance)
    {
        this.balance=balance;
    }
    public void withdraw(int amount) throws InsufficientFundsException{
        if(amount>balance)
        {
            throw new InsufficientFundsException("Withdrawal amount exceeds current balance.");
        }
        this.balance=this.balance-amount;
    }

    public static void main(String[] args) {
        Bank myAccount = new Bank(5000);
        try {
            myAccount.withdraw(6000);
        }catch (InsufficientFundsException e)
        {
            System.out.println("Exception :"+e.getMessage());
        }finally {
            System.out.println("Transaction processing completed.");        }
    }
}
