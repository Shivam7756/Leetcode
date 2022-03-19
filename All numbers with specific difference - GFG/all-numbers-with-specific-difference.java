// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            Long N = Long.parseLong(S[0]);
            Long D = Long.parseLong(S[1]);

            Solution ob = new Solution();
            System.out.println(ob.getCount(N,D));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static Long getCount(Long N , Long D) {
       Long low =Long.valueOf(1);
       Long high = N;
       while(low<=high){
           Long mid = low+(high-low)/2;
           if(mid-sumOfDigits(mid)<D){
               low = mid+1;
           }
           else{
               high = mid-1;
           }
       }
       return (N-high);
    }
    static Long sumOfDigits(Long num ){
        Long sum  =Long.valueOf(0);
        while(num>0){
            sum = sum+num%10;
            num=num/10;
        }
        return sum;
    }
};