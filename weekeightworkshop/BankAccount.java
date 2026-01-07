package weekeightworkshop;


public class BankAccount
{
    private double accountNumber;
     private double balance;
    private String name;
    
    BankAccount( double ACNumber, double bal , String name){
    this.accountNumber=ACNumber;
    this.balance=bal;
    this.name=name;
    }
    public double getBalance()
    {
    return balance;
    }
    public void deposit(double amount)
    {
     this.balance=this.balance+amount;
    }
    
    public boolean withdraw(double amount){
    if (amount <= this.balance)
    { System.out.println("success");
        this.balance=amount;
        return true;
    }else
    {
        System.out.println("error");
        return false;
    }
    }
     
     
}