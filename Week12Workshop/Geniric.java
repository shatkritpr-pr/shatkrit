package Week12Workshop;
import java.util.Iterator;
import java.util.ArrayList;


/**
 * Write a description of class Geniric here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Geniric
{
     public static void main(String[] args)
    {
        ArrayList<String> names= new ArrayList();
        ArrayList<Integer> nums= new ArrayList();
        
        names.add("Dikshnat");
        names.add("Ram");
        names.add("Shyam");
        names.add("Gita");
        names.add("Hari");
        
        System.out.println(names);
        
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        
        System.out.println(nums);
        
        for(String name :names)
        {
            System.out.println(name);
        }
        
        for(int num: nums)
        {
            System.out.println(num);
        }
        
        Iterator<String> itr= names.iterator();
        
        while(itr.hasNext())
        {
            String name= itr.next();
            System.out.println(name);
        }
        
        Iterator<Integer> str= nums.iterator();
        
        while(itr.hasNext())
        {
            int num= str.next();
            System.out.println(num);
        }
        
        names.remove(2);
        System.out.println(names);
        
        System.out.println(names.size());
        
        System.out.println(nums.size());
        
        nums.clear();
        System.out.println(nums);
        
        System.out.println(names.get(2));
        System.out.println(names.get(3));
    }
}