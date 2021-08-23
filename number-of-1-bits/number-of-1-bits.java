public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        while(n!=0){//not equal to zero , as negative binary no may fail
            n = n & (n-1);
            count++;
        }
        return count;
    }
}