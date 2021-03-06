class Solution {
    public void merge(int[] a1, int m, int[] a2, int n) {
        int[] a3 = new int[m+n];
        int i = 0;//traversing arr1
        int j = 0;//traversing arr2
        int k = 0;//for the result array inserted to be in int a1 array

        while(i<m && j<n)//traversing in both the arrays
        {
            if(a1[i]<a2[j])//filling the result array
            {
              a3[k] = a1[i];
              i++;
            }

            else
            {
             a3[k] = a2[j];
              j++;
            }
            k++;
        }

        while(i<m)
        {
            a3[k] = a1[i];
            i++;
            k++;
        }

        while(j<n)
        {
            a3[k] = a2[j];
            j++;
            k++;
        }
        
        int o = m + n;
        int l = 0;
        int s = 0;
        
        while(l<o && s<o)
        {
            a1[l] = a3[s];
            l++;
            s++;
        }
     }
    
}
