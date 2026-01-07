package weekeightworkshop;
import java.util.Scanner;

public class ATM
{
    public static void main (String [] args){
    Scanner input=new Scanner (System. in);
   BankAccount a1=new BankAccount (1,10000,"Ram");
System.out.println("Current balance is=" +a1.getBalance());
System.out.println("how mcuh would you like to deposit?"); 
double tmp=input.nextDouble() ;
a1.deposit (tmp);
System.out.println("how much you want to withdraw"); 
tmp=input.nextDouble() ;
a1.withdraw(tmp) ;
System.out.println("Current balance is= " +a1.getBalance());

}
}