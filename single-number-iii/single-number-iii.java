class Solution {
    public int[] singleNumber(int[] nums) {
        
        int n = nums.length;
        
        int xorr = 0;
        
        for(int i=0;i<n;i++){
            
            xorr ^= nums[i];
        }
        
        int mask = xorr & -xorr;
        
        int a = 0;
        
        for(int i=0;i<n;i++){
            
            if((mask & nums[i])!=0) a ^= nums[i];
        }
        
        int b = xorr ^ a;
        
        return new int[] {a,b};
    }
}