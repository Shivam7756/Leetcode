// { Driver Code Starts
import java.util.*;
import java.util.Scanner;

  public class longestString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t;

        t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n;
            n = sc.nextInt();
            String[] names = new String[n];

            for (int j = 0; j < n; j++) names[j] = sc.next();

            GFG obj = new GFG();
            System.out.println(obj.longest(names, n));
        }
    }

}
// } Driver Code Ends


class GFG {
    String longest(String a[], int n) {
        
        String s = a[0];
        
      for(int i = 1 ; i<n ; i++)
      {
          String s1 = a[i];
          
          if(s1.length()>s.length())
          {
              s = a[i];
          }
      }
      
      return s;
    }
}