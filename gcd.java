import java.util.*;
public class gcd {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first no");
        int a = in.nextInt();
        System.out.println("Enter the second no");
        int b = in.nextInt();
        gcd.find(a,b);
        in.close();
    }

    public static void find(int m , int n)
    {
       int hcf = 1;
       
       for(int i = 1 ; i<=m&&i<=n ; i++)
       {
           if(m%i==0&&n%i==0)
           hcf = i;
       }

       System.out.println(hcf + " = HCF");

    }
    
}
