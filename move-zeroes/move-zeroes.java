class Solution {
    public void moveZeroes(int[] nums) {
       
        int j = 0;//for zero -  containing elements
        //int i = 0 for non - zero elements
        for(int i = 0 ; i<nums.length ; i++)
        {
            if(nums[j]==0&&nums[i]!=0)
            {
                int t = nums[j];
                nums[j] = nums[i];
                nums[i] = t;
            }
            
            if(nums[j]!=0)
                j++;//if non - zero elements come we simply increment it           
        }
        
    }
}