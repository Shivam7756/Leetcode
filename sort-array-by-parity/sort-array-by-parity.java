class Solution {
    public int[] sortArrayByParity(int[] a) {
        int i = 0;
        int j = 0;
        
        for(;i<a.length;i++)
        {
            if(a[i]%2==0&&a[j]%2!=0)
            {
               int temp = a[i]; 
               a[i] = a[j];
               a[j] = temp;
            }
            
            if(a[j]%2==0)
               j++; 
        }
        
        return a;
        
    }
}