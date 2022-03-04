// { Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
	public static int palinArray(int[] a, int n)
           {
              int bool = 0;
              
             for(int i = 0 ; i<n ; i++)
             {
                  int sum = 0;
                  int l = a[i];
                  int k = a[i];
                  
                 while(k>0)
                 {
                     int r = k%10;
                     k/=10;
                     sum = sum*10+r;
                 }
                 
                 if(l==sum)
                 {
                     bool++;
                 }
                 
             }
              
              int ans = 0;
              if(bool==a.length)
              {
                  ans = 1;
              }
              
              else
               ans = 0;
               
              return ans;  
                  //add code here.
           }
}           
           