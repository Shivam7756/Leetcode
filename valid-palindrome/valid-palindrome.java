class Solution {

public boolean isAlphaNum(char c)
{
// a == 97 and z == 122
// 0 == 48 and 9 = 57
if( (48<=c && c<=57) ||(c >= 97 && c <= 122)) {
return true;
}  
    
    else{
return false;
}
}
    
    
public boolean isPalindrome(String s) {

    char ch[] = s.toCharArray();
    
     for(int k = 0 ;k<ch.length ;k++)
        {
            if(ch[k]>='A' && ch[k]<='Z')
                ch[k] = (char)((int)ch[k] + 32);
        }
    
    // two pointer approch
    // lo for lower index
    // hi for higher index
    int lo = 0;
    int hi = s.length() -1;
    
    while(lo <= hi){
        //chlow = lower indexed charecter
        //chhigh = higher indexed character
        char chlow = ch[lo];
        char chhigh = ch[hi];
        
        
        if(!isAlphaNum(chlow)){
            lo++;
        }else if(!isAlphaNum(chhigh)){
            hi--;
        }else if(chlow == chhigh){
            lo++;
            hi--;
        }else{
            return false;
        }
        
    }
    return true;
}
}
