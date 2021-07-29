import java.util.*;
public class print_digits {
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the number");
      int a = in.nextInt();
      print_digits.print(a);
      in.close();

    }

    public static void print(int b)
    {
        int rev = 0;
        while(b>0)
        {
            int temp = b%10;
            temp = temp%10;
            rev = rev*10 + temp;
            b = b/10;
        }

        while(rev>0)
        {
            System.out.print(rev%10 + " ");
           rev = rev/10;
        }
    }
    
}
