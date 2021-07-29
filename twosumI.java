package array;
import java.util.*;
import java.util.Map;
import java.util.HashMap;
public class twosumI {

    public static int[] rein(int[] arr ,int target)
    {
        Map<Integer , Integer> map = new HashMap<>();//storing the element and its indice values
        int[] res = new int[2];
        for(int i = 0 ; i<arr.length ; i++)
        {
            if(!map.containsKey(target - arr[i]))//check whether target - current element present in the array
            map.put(arr[i], i);//if not then put in the hash map , with the key and value.

            else
            {
               res[1] = i;
               res[0] = map.get(target - arr[i]);
               return res;
            }
        }
        throw new IllegalArgumentException("Number not found");
    }

    public static void main(String args[])
    {
      Scanner in =  new Scanner(System.in);
      System.out.println("Enter the size of array");
      int n =  in.nextInt();
      int[] a = new int[n];

      System.out.println("Enter the elements of array");
      for(int i = 0 ; i<a.length ; i++)
      {
          int temp = in.nextInt();
          a[i] = temp;
      }
    
      System.out.println("Enter target element");
      int t = in.nextInt();
      int resul[] = rein(a,t);
      System.out.println("required indices = " + resul[0] + " , " + resul[1]);
      in.close();
    }
    
}
