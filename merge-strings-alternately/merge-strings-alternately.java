class Solution {
    public String mergeAlternately(String word1, String word2) {
    char[] ch =new char[word1.length()+word2.length()];
    int k = 0;
    int i = 0;
    int j = 0;
    for(;i<word1.length() || i<word2.length();i++)
    {
        if(i<word1.length() && i<word2.length())
        {
        ch[k++]=word1.charAt(i);
        ch[k++]=word2.charAt(j++);
        }
        else if(i<word1.length())
        {
            ch[k++]=word1.charAt(i);
        }
        else
        {
            ch[k++]=word2.charAt(j++);
        }
       
    }
    
    return new String(ch);
}
}
