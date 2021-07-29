class Solution {
    public int[] plusOne(int[] a) {
        
        for(int i = a.length - 1;i>=0 ; i--)//moving the array backwards
        {
            if(a[i]<9)
            {
                a[i]++;
                return a;//returning the whole array
            }
            
            else
            {
                a[i] = 0;
            }
        }
        
            int res[] = new int[a.length + 1];
            res[0] = 1;
            return res;
    }
}