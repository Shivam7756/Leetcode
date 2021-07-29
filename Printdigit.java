import java.util.*;
public class Printdigit {
    public static void main(String args[])
    {
        Printdigit p = new Printdigit();   
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int a = in.nextInt();
        p.displaydigit(a);
        in.close();
    }


    public  void displaydigit(int b)
    {
      int rev = 0;
      while(b>0)
      {
        int temp = b;
        temp = temp%10;
        rev = rev*10 + temp;
        b=b/10;
      }

      while(rev>0)
      {
        System.out.print(rev%10 + " ");
        rev = rev/10;
      }
    }
    
}
