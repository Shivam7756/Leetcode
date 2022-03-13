// { Driver Code Starts
import java.util.*;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Solution ob = new Solution();

        int T = sc.nextInt();

        while (T != 0) {
            long n = sc.nextLong();
            if (ob.fascinating(n))
                System.out.println("Fascinating");
            else
                System.out.println("Not Fascinating");
            T--;
        }
    }
}// } Driver Code Ends


class Solution {
    boolean fascinating(long n) {
        long a = n*2;
        long b = n*3;
         
         String org = "123456789";
         String s1 = Long.toString(n);
         String s2 = Long.toString(a);
         String s3 = Long.toString(b);
         
         String s = s1+s2+s3;
         char c[] = s.toCharArray();
         Arrays.sort(c);
         String str = String.valueOf(c);
         
         if(str.equals(org))
         {
             return true;
         }
         
         else
          return false;
         
        // code here
    }
}