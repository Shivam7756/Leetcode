class Solution {
    public String mergeAlternately(String s1, String s2) {
          int i=0,j=0;
        String s="";
        while(i<s1.length() && j<s2.length())
           s = s + s1.charAt(i++) + s2.charAt(j++);
        while(i<s1.length())
            s+= s1.charAt(i++) ;
        while(j<s2.length())
            s+= s2.charAt(j++) ;
        return s;
        
    }
}