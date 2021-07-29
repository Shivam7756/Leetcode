import java.util.*;
import java.security.*;
public class tosscoun {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Toss a coin , or Enter 0 to quit");
        int a = in.nextInt();
        int heads = 0;
        int tails = 0;
        while(a>0)
        {
            int b = tosscoun.flip();
            if(b==0)
            heads++;
            else
            tails++;
            
            System.out.println("Toss a coin , or Enter 0 to quit");
            a = in.nextInt();
        }

        System.out.println(heads + " = Heads " + tails + " = Tails");
        in.close();
    }

    public static int flip()
    {
       SecureRandom ran = new SecureRandom();
       int a1 = ran.nextInt(2);

       if(a1==0)
       {
       System.out.println("Heads and true");
       return 0;
       }
       else
       {
        System.out.println("Tails and false");
        return 1;
       }
    }
}
