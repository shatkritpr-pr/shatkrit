import java.util.Scanner;

/**
 * Write a description of class scenarioweek6WK here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class scenarioweek6WK
{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String[] categories={"Fiction","Nepali"};
        String[][] titles=new String[2][1];
        double[][] prices=new double[2][1];
        titles[0][0] = "Asahamati - 5"; 
        
        prices[0][0] = 750.0;

        prices[1][0] = 890.9876;
        for(int i=0;i<2;i++){
            if(categories[i]==null){
                System.out.println("empty");
            }else{
            System.out.println("Category: "+categories[i]);
            }
            for(int j=0;j<1;j++){
                if(titles[i][j]==null){
                     System.out.println("empty title ");
                }else{
                System.out.println("title: "+titles[i][j]);
                }
                if(prices[i][j]==0.0){
                     System.out.println("empty price");
                }else{
                System.out.printf(" price: %.2f%n", prices[i][j]);
            }
            }
        }
    }
}
