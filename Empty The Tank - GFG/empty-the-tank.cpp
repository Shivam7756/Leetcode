// { Driver Code Starts
// Initial Template for C++
#include <bits/stdc++.h>
using namespace std;

 // } Driver Code Ends
// User function Template for C++
class Solution {
  public:
    long long int minDaysToEmpty(long long int c, long long int l) {
        
        long long int k = 0;
        long long int ca = c;
        
        for(long long int i = 1; ; i++)
        {
           
           if(i==1)
           {
               c = c - i;
               
               if(c<=0)
               {
                   k = i;
                   break;
               }
           }
           
           else{
               c = c + l;
                if(c>ca)
                {
                    c = ca;
                }
              c = c - i;    
              if(c<=0)
              {
                  k = i;
                  break;
              }
           }
           
            
            
        }// code here
    }
};

// { Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        long long int c, l;
        cin >> c;
        cin >> l;
        Solution ob;
        cout << ob.minDaysToEmpty(c, l) << endl;
    }
    return 0;
}
  // } Driver Code Ends