package weekeighttutorial;

public class main
{
    public static void main(String[] args)
    {
    calculator calc= new calculator();
    //instance,void,non parameterised
    calc.displayInfo();
    calc.add(10,20);//actual parameters
    
    int fixNum= calc.getFixedNumber();
    System.out.println("The fixed number is :"+ fixnum);
    System.out.println("the multiplication of two numbers are:"+ calc.multiply(10,20));
    
    // invocation of static method ---> use className
    int sqr= Calculator.square(10);
    System.out.println("The square is:" + sqr);
    //contruster-no return type, no logic 
    
    //student objects
    Student st1= new Student("Sandesh",101);
    
    
    

    
    
    }
}