package weekeighttutorial;

public class calculator
{
    //instance method
    //void return type + no parameters
    public void dispalyInfo(){
    System.out.println("Welcome to Calculator App.");
    }
    
    //void return type + parameters
    // method overloading
    //add(int a,int b),add(double a ,double b),add(int a,int b,int c)
    public void add (int a,int b) { // formal parameters
    System.out.println("the sum of two numbers are:"+(a+b));
    }
 
    public void add(double a,double b){
     System.out.println("the sum of two numbers are:"+(a+b));
    }
    
     public void add(int a,int b,int c){
     System.out.println("the sum of three numbers are:"+(a+b));
    }
    
     public void add(double a,int b,int c){
     System.out.println("the sum of three   ` numbers are:"+(a+b));
    }
    
 
 //return type + no parameters
  public int getFixedNumber()
  {
    return 10;
    }
    //return type + parameters
    public int multiply(int a, int b){//formal parameter
    return a*b;
    }
    
    //static method + return type +parameters
    public static int square(int x){
    return x*x;
    }
    
}