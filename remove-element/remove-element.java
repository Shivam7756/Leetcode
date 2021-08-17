class Solution {
    public int removeElement(int[] nums, int val) {
       
        int k = 0;//for those element whose value not equal to val
        
        for(int i = 0;i<nums.length ; i++)
        {
            if(nums[i]!=val)
            {
              nums[k] = nums[i];
               k++;
            }
        }
        return k;//returning index upto whch value to be returned
    }
}
