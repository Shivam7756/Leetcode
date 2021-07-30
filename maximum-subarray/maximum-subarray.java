class Solution {
    public int maxSubArray(int[] arr) {
        int curr = arr[0];
        int max  = arr[0];
        
        for(int i = 1 ; i<arr.length ; i++)
        {
            curr = curr + arr[i];//check to continue with old subarray
            
            if(curr<arr[i])
            {
                curr = arr[i];//check if to start new subarray
            }
            
            if(curr>max)
            {
                max = curr;//check if current sum greater than max so far
            }
        }
        
        return max;
        
    }
}