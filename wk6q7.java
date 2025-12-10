import java.util.Scanner;

/**
 * Write a description of class wk6q7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class wk6q7
{
    public static void main (String[] args){
Scanner input=new Scanner (System.in);
String[] [] seats=new String[2][3];
for (int i=0; i<2;i++){
         for (int j=0; j<3;j++) {
                    if(i==1){
           seats [i][j]=null;
        }else{
System.out.println("enter name for first row and"+(j+1)+" column"); 
seats [i][j]=input.nextLine();
}
}
}

  for (int i=0;i<2;i++){
for (int j=0; j<3; j++) {
if (seats [i] [j]==null){
System.out.println((i+1)+".row "+(j+1)+".column is empty");
}else{
System.out.println((i+1) +".row "+(j+1)+"-column="+seats [i][j]) ;
}
}
}
}
}