package WEEK10TUTORIAL;

public class BankingApp
{
    public static void main(String[] args)
    {
        // long accountNumber, String holderName, double balance
        SavingAccount acc1= new SavingAccount(10001, "Sandesh Paudel", 20000);
        CurrentAccount acc2= new CurrentAccount(10002, "Sagar", 50000);
        
        double interest1= acc1.calculateCompoundInterest(5);
        double interest2= acc2.calculateCompoundInterest(5);
        
        
        System.out.println("Compound interest of saving account: "+ interest1);
        System.out.println("Compound interest of current account: "+ interest2);
        
    }
}
