class Solution {
    
      public boolean checkle(char c)
     {
      if((c>=65 && c<=90)|| (c>=97 && c<=122))
                return true;
            else
                return false;
        }
        
    public String reverseOnlyLetters(String s) {
        
       char[] ch = s.toCharArray();
       int lo = 0;
       int hi = s.length() - 1;
       
        while(lo<hi)
        {
            
                      
            if(!checkle(ch[lo])){
                lo++;}
            
            else if(!checkle(ch[hi])){
                hi--;}
            
            else{
                char c = ch[lo];
                ch[lo] = ch[hi];
                ch[hi] =  c;
                lo++;
                hi--;
                }
            }
        
                
       
        return String.valueOf(ch);
        }      
    }  
