package week9workshop;


/**
 * Write a description of class SavingAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
    public class SavingAccount extends Bank_Account
{
    private double interestrate;
    public SavingAccount(String accountnumber,String accountname,double balance,double interestrate){
        super(accountNumber,accountholdername,balance);
        this.interestrate=interestrate;
    }public double Interest(){
        return super.gbalance()*interestrate/100;
    }
    
}