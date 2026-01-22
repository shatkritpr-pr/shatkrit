package Week12Tutorial;
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
    public static void main (String[] args){
    ArrayList<Integer> arrlist= new ArrayList<>();
    System.out.println(arrlist.isEmpty());
    //adding an element in arraylist
    arrlist.add(50);
     arrlist.add(60);
      arrlist.add(70);
      //checl if an arraylist is empty
       System.out.println(arrlist.isEmpty());
      System.out.println(arrlist);
      //adding along with index
      arrlist.add(0,90);
      System.out.println(arrlist);
      //removing an element
      arrlist.remove(0);
      System.out.println(arrlist);
      //accessing an element From
      System.out.println(arrlist.get(0));
      //setting a new value
      arrlist.set(0,95);
      System.out.println(arrlist);
      //check if an element is in an arraylist
      System.out.println(arrlist.contains(90));
      System.out.println(arrlist.indexOf(95));
      
      //length or size of an arraylist
      System.out.println(arrlist.size());
      
      //traversing(first to last,all elements) an arraylist
      // --> for each loop
      
      for(int arr: arrlist)
      {
        System.out.println(arr);
        }
        //iterators (1.has Next()),(2.Next()),(3.Remove())
        
        Iterator<Integer> itr=arrlist.iterator();
        while(itr.hasNext())
        {
        int mrk=itr.next();
        if(mrk ==95)
        {
            itr.remove();
        }
        }
System.out.println(arrlist);
       /* {
        int mrk=itr.next();
        System.out.println(mrk);
        }
      */
    }
}