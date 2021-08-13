class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String a=new String();
        for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i)>='a' && s.charAt(i)<='z')|| (s.charAt(i)>='0' && s.charAt(i)<='9'))
                a=a+s.charAt(i);
        }
        int i=0;
        int j=a.length()-1;
        
        while(i<j)
        {
            if(a.charAt(i)!=a.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}