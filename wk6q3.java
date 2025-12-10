import java.util.Scanner;

/**
 * Write a description of class wk6q3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class wk6q3
{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        String[] names={"Saroj","Sushant","Ujjwal","Rabina","Sandesh"};
            for(int i=0;i<names.length;i++){
                System.out.println(names[i]);
                }
                System.out.println(names[2]);//print 3rd element
                names[4]="Shatkrit";
                System.out.println(names[4]);
                System.out.println("enter index");
                int i=a.nextInt();
                a.nextLine();
                System.out.println("enter a name");
                names[0]=a.nextLine();
                System.out.println("new updated array is");
                for(i=0;i<names.length;i++){
                System.out.println(names[i]);
                }
                }
}
