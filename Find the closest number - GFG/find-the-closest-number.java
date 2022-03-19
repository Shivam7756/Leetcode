// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class GFG {
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		while(testcases-- > 0){
		    
		    String line1 = br.readLine();
		    String []element = line1.trim().split(" ");
		    int n = Integer.parseInt(element[0]);
		    int target = Integer.parseInt(element[1]);
		    
		    int arr[] = new int[n];
		    
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split(" ");
		    
		    for(int index = 0;index < n; index++){
		        arr[index] = Integer.parseInt(elements[index]);
		    }
		    
		    Solution obj = new Solution();
		    
		    System.out.println(obj.findClosest(arr, n, target));
		        
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    
    public static int findClosest(int arr[], int n, int target) 
    { 
        Arrays.sort(arr);
       int ans = Integer.MAX_VALUE;
       int clo = 0;
       for(int i = 0; i<n; i++){
           
           int a  = Math.abs(arr[i]-target);
           if(a<=ans){
               ans = a;
               clo = arr[i];
           }
       }
       return clo;
        // Complete the function
    } 
}

