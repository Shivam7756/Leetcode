import java.util.*;
public class perfect {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = in.nextInt();
        perfect.pnum(a);
        in.close();
    }
    
    public static void pnum(int m)
      {
          int sum = 0;
          for(int i = 1;i<m ; i++)
          {
              if(m%i==0)
              sum = sum + i;
          }

          if(sum==m) 
          System.out.println("YES");
          else
          System.out.println("NO");
      }
}
