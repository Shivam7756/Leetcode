package array;
import java.util.*;

//program for checking twosum in an array
public class Twosum2{//using sorting and with the help of pointers

    public static int[] twosumII(int[] arr , int Target)
        {
           //so that we can manipulate array accordingly
           int left = 0;//for starting with beginning of the array
           int right = arr.length - 1;//for starting with the end of the array
           int[] result = new int[2];

           while(left<right)
           {
               int sum = arr[left] + arr[right];//for checking whether the pair exists in the array
               if(sum==Target)
               {
                  result[0] = left;
                  result[1] = right;
                  return result;
               }

               else if(sum<Target)
               {
                  left++;
               }

               else{
                   right--;
                   }
           }
                throw new IllegalArgumentException("Number not found");
        }   
        
    public static void main(String args[])
    {
      Scanner in =  new Scanner(System.in);

      System.out.println("Enter the size of array");
      int a = in.nextInt();

      int[] a1 = new int[a];

      System.out.println("Enter the elements of array");
      for(int i = 0 ; i<a1.length ; i++)
      {
          int temp = in.nextInt();
          a1[i] = temp;
      }

      System.out.println("Enter the target element");
      int tar = in.nextInt();

    int[] fin =  twosumII(a1, tar);//assigning the result array from method
    System.out.print("the required numbers are = ");
    for(int i = 0; i<fin.length ; i++)
    { 
      System.out.print( fin[i] + " ");
    }
    in.close();
   }    
}
