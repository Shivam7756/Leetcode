class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", " ");
        s = s.replaceAll(" ", "");
        
        int start = 0 ;
        char ch[] = s.toCharArray();
        int end  =  s.length() - 1;
        
        while(start<end)
        {
            if(ch[start]!=ch[end])
            return false;
            start++;
            end--;        
        }
        
    return true;
        
    }
}