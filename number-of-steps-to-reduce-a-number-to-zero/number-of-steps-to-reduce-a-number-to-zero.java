class Solution {
    public int numberOfSteps(int num) {
        int k = 0;
        
        while(num>0)
        {
            if((num&1)==0)
            {
                num = (num>>1);
                k++;
            }
            
            else
            {
                num = num - 1;
                k++;
            }
        }
      return k;  
    }
}