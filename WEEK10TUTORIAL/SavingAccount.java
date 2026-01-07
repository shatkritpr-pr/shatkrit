package WEEK10TUTORIAL;

public class SavingAccount extends BankAccount
{
    public SavingAccount(long accountNumber, String holderName, double balance)
    {
        super(accountNumber,  holderName, balance);
    }
    
    @Override
    protected double getInterest()
    {
        return 2.0;
    }
    

}
