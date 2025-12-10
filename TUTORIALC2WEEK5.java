import java.util.Scanner;

/**
 * Write a description of class TUTORIALC2WEEK5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TUTORIALC2WEEK5
{
    public static void main (String[] args){
        /*
        int sum=0;
        for(int i=1;i<=10;i++)
        {
            sum=sum+i;
    }
    System.out.println("The sum of 10 Natural number is:"+ sum);
}
*/
// for loop when there is limit
// while loop when there is not limit,use i++ compulsory in while loop
/*
int i=1;
while (i <=3)
{ 
    System.out.println("While loop:");
    i++;
}
*/
//do while do ma body,statement in while,first statement then condition
 /*
int i=1;
 do{ 
     System.out.println(i);
     i=i+2;
}while(i<1);
*/
//unconditional statement:1)break statement ,2)continue statement
/*
System.out.println("Give me the range.");
Scanner input= new Scanner(System.in);
for(int i=1; i<=10;i++)
 {  
     if (i==4)// i%2 == 0 even, i%2 ==1 odd
     {
         break;//continue(skip),break(skip other results after the condition,
     }
     System.out.println(i);
    }
    */
   //nest loop
   for (int i=1; i<=3; i++)
   {
       for(int j=1;j<=2;j++)
       {
       System.out.println("i: "+ i+"j :"+j); //System.out.println("*");
    }
    System.out.println();
}
}
}