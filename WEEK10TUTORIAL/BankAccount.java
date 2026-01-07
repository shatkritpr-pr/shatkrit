package WEEK10TUTORIAL;


public class BankAccount
{
    private long accountNumber;
    private String holderName;
    private double balance;
    
    public BankAccount(long accountNumber, String holderName, double balance)
    {
        this.accountNumber= accountNumber;
        this.holderName= holderName;
        this.balance= balance;
    }
    
    public void setAccountNumber(long newAccountNumber) // mutators
    {
        this.accountNumber= newAccountNumber;
    }
    
    public long getAccountNumber() // accessors
    {
        return this.accountNumber;
    }
    
    public double getBalance()
    {
        return this.balance;
    }
    
    // by cash
    public void deposit(double amount)
    {
        if(amount> 0)
        {
            balance+= amount;
            System.out.println("Deposited amount: "+ amount);
            System.out.println("Balance after deposit: "+ this.getBalance());
        }
        else
        {
            System.out.println("Invalid amount for deposit.");
        }
    }
    // by cheque
      public void deposit(double amount, String chequeNumber)
    {
        if(amount> 0)
        {
            balance+= amount;
            System.out.println("Deposited amount: "+ amount);
            System.out.println("Balance after deposit: "+ this.getBalance());
            System.out.println("Cheque Number: "+ chequeNumber);
        }
        else
        {
            System.out.println("Invalid amount for deposit.");
        }
    }
    
    
    
    protected double getInterest()
    {
        return 0.0;
    }
    
    public double calculateCompoundInterest(double years)
    {
        return ((this.getBalance()* this.getInterest()* years)/100);
    }
    
    
}
