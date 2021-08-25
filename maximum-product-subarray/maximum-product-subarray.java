 //here , we have to also keep the track of minimum , as two negative may lead to largest product in subarray
        //[2,-5,-2,-4,3]
      class Solution {
    public int maxProduct(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int mfar = nums[0];
        for(int i = 1; i<nums.length; i++){
            
            int tempMin = min; //current minimum
            int tempMax = max; //current maximum
            
            min = Math.min(nums[i],Math.min(tempMin*nums[i],tempMax*nums[i]));
            max = Math.max(nums[i],Math.max(tempMax*nums[i],tempMin*nums[i]));
            mfar = Math.max(max,mfar);
        }
        return mfar;
    }
}