package Week12Workshop;
import java.util.ArrayList;
import java.util.Iterator;


/**
 * Write a description of class Arr here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Arr
{
    public static void main(String[] args)
    {
        ArrayList<Integer> marks= new ArrayList();
        System.out.println(marks.isEmpty());
        
        
        // adding an element
        marks.add(60);
        marks.add(10);
        marks.add(40);
        System.out.println(marks);
        
        marks.add(1, 30);
        System.out.println(marks);
        
        // checking if arraylist is empty
        System.out.println(marks.isEmpty());
        
        //finding the length or size
        System.out.println(marks.size());
        
        // removing element
        marks.remove(0);
        System.out.println(marks);
        
        //accesing an element
        System.out.println(marks.get(1));
        
        //settiing a new value
        marks.set(0, 23);
        System.out.println(marks);
        
        //check if value exist
        System.out.println(marks.contains(44));
        
        //check the index of the value 
        System.out.println(marks.indexOf(80));
        
        // traversing in arraylist
        for(int mark: marks)
        {
            System.out.println(mark);
        }
        
        //iterator for traversing 
        Iterator<Integer> itr= marks.iterator();
        
        while(itr.hasNext())
        {
            int mark= itr.next();
            System.out.println(mark);
        }
    }
}