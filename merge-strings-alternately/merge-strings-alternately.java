class Solution {
    public String mergeAlternately(String s1, String s2) {
        String s = "";
       
        for(int i = 0;i<s1.length()||i<s2.length();i++)
        {
            if(i<s1.length())
                s = s + s1.charAt(i);
            if(i<s2.length())
                s= s + s2.charAt(i);    
        }
        
        return s;
       
    }
}