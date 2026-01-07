package week9workshop;


/**
 * Write a description of class Bank_Account here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bank_Account
{
    /*
    protected double accountNumber;
    protected String accountholdername;
    protected double balance;
    
    public Bank_Account(double AC,String ACholdername,double Bal){
    this.accountNumber=AC;
    this.accountholdername=ACholdername;
    this.balance=Bal;
}
    public void deposit(double amount){
     if(amount > 0)
     {
         this.balance= this.balance + amount;
     }
 else{ 
System.out.println("invalid");    
    }
    }
    public double gbalance(){
        return balance;
    }
    public String accountinfo(){
        return "Account:"+accountNumber+"Holder:"+accountholdername;
    }

   
    */
    private String accountnumber;
    private String accountname;
    protected double balance;
    public Bank_Account(String accountnumber,String accountname,double balance){
        this.accountnumber=accountnumber;
        this.accountname=accountname;
        this.balance=balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposited:"+amount);
        }
        
    }
    public double gbalance(){
        return balance;
    }
    public String accountinfo(){
        return "Account:"+accountnumber+"Holder:"+accountname;
    }
}