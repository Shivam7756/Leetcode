// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		    
		    int arr [] = new int[sizeOfArray];
		    
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    int brr [] = new int[sizeOfArray];
		    
		    line = br.readLine();
		    String[] ele = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        brr[i] = Integer.parseInt(ele[i]);
		    }
		    
		    Complete obj = new Complete();
		    int res = obj.check(arr, brr, sizeOfArray);
		    
		    System.out.println(res);
		}
	}
}


            
// } Driver Code Ends


            

class Complete{
    
    // Function for finding maximum and value pair
    public static int check (int a[], int[] b, int n) {
        //Complete the function
        Arrays.sort(a);
        Arrays.sort(b);
        int count = 0;
        
        for(int i = 0;i<a.length ; i++)
        {
            if(a[i]==b[i])
            {
                count++;
            }
        }
        
        if(count == n)
        return 1;
        
        else
        return 0;
    }
    
    
}