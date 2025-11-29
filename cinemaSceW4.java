import java.util.Scanner;

/**
 * Write a description of class cinemaSceW4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class cinemaSceW4
{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        double price = 0;
        System.out.println("-----XFX TICKET COUNTER-----");
        
        System.out.println("Enter age group(child/adult/senior)");
        String AgeGrp = s.next();
        
        System.out.println("Enter movie language(English/Nepali/Hindi)");
        String mlanguage = s.next();
        
        System.out.println("Are you a student?(Yes/No)");
        String std = s.next();
        
        System.out.println("Is today a festival day?(Yes/No)");
        String fest = s.next();
        
        switch (AgeGrp){
            case "child":
                price = 150;
                break;
            case "adult":
                price = 250;
                break;
            case "senior":
                price = 200;
                break;
                default:
                    System.out.println("ERROR");
            }
            
            switch(mlanguage){
                case "English":
                    price  += 100;
                    break;
                case "Nepali":
                    break;
                case "Hindi":
                    price +=50;
                    default:
                        
                        System.out.println("ERROR");
            }
            
            if (std == "Yes"){
                price = price-(price*0.20);
            }
            
            if (fest == "Yes"){
                price = price-(price*0.15);
            }
            
            System.out.println("AGE GROUP:" + AgeGrp);
            System.out.println("MOVIE LANGUAGE:" + mlanguage);
            System.out.println("STUDENT:" + std);
            System.out.println("FESTIVAL DAY:" + fest);
            System.out.println("\nTotal Price:" + price);
        
        
    }
}