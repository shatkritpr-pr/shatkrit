
/**
 * Write a description of class week6array here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week6array
{
    public static void main(String[] args){
    /*
     //to take array from user
     
        int [] age; //declaring an array
    age = new int[5]; //constructing an array
    
    System.out.println(age.length);//length of an array
    
    age[0]= 10;//number of index=length-1 length=.length
    age[1]= 20;
    age[2]= 30;
    age[3]= 40;
    age[4]= 50;
    int firstElement= age[0];
    System.out.println(firstElement);
    int [] agr={5,10,15,20,25};
    int start =0;
    int end= agr.length-1;
    for(int i=start; i<= end; i++){ 
        System.out.println(agr[i]);
        //max min
        if (agr[i]>max)
        {
            max=agr[i];
        }
        
    }
    */
   /*
    int [] rev={5,10,15,20,25};
    int start2=0;
    int end2= rev.length-1;
    for(int p=end2; p >= start2; p--){
          System.out.println(rev[p]);}
        */
          
          //two dimensional arrays
           int [] rev={5,10,15,20,25};
          int [][] matrix={{1,2,3},{4,5,6},{7,8,9}};
         System.out.println(matrix[0][1]);
         System.out.println(matrix[1][0]);
          System.out.println(matrix[1][1]);
          System.out.println(matrix[1][2]);
          
          for(int i=0;i <= matrix.length-1;i++){
              for(int j=0; j<= matrix[i].length-1;j++){
                System.out.print(matrix[i][j]);
                }//dynamic length
            //to convert System.out.println(Arrays.toStringmatrix[i]);
            System.out.println();
            }
    }
}