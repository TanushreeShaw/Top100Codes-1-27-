import java.util.Scanner;

public class PrimeOrNot9
 {
   public static void main (String[]args)
   {
        Scanner in=new Scanner(System.in);
        int i,n,c=0;
        System.out.println("Enter a Number:");
        n=in.nextInt();

        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(n==1)
        {
            System.out.println ("The number " + n + " is not Prime");
        }
        else if(c>2)
        {
            System.out.println ("The number " + n + " is not Prime");
        }
        else
        {
            System.out.println ("The number " + n + " is Prime");
        }
    }
}