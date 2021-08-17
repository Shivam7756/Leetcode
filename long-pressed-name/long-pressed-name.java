class Solution {
   public boolean isLongPressedName(String name, String typed) {
         int i=0,j=0;
        boolean flag=true;
        while(i<name.length() && j<typed.length())
        {
            if(name.charAt(i)==typed.charAt(j)){
                i++;
                j++;
            }else{
                if(i>0 && name.charAt(i-1)==typed.charAt(j))j++;
                else {
                    flag=false;
                    break;
                }
            }
        }
        if(i<name.length())return false;
        while(j<typed.length() && name.charAt(i-1)==typed.charAt(j))j++;
        if(j<typed.length())
            flag=false;
        return flag;

    }
}