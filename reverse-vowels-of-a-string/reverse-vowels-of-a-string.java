class Solution {
    
    public boolean vo(char c)
    {
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            return true;
        else
        {
            return false;
        }
        
    }
    
    
    public String reverseVowels(String s) {
        //here , i will only reverse the vowels of the string and leave the rest string
         
        
        int lo = 0;
        int hi = s.length()-1;
        char ch[] = s.toCharArray();
            
            while(lo<hi)
        {
           
            
            if(!vo(ch[lo]))
                lo++;
            else if(!vo(ch[hi]))
                hi--;
            else
            {
                char t = ch[lo];
                 ch[lo] = ch[hi];
                 ch[hi] = t; 
                lo++;
                hi--;
            }
        }
        
       return String.valueOf(ch);
    }
}