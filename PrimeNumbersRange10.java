import java.util.*;
public class PrimeNumbersRange10
{
    public  static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int num1,num2,i,j;
        System.out.println("Enter a range Number1 and Number2:");
        num1=in.nextInt();
        num2=in.nextInt();
        
        System.out.println("The Prime Numbers are:");
        for(i=num1;i<=num2;i++)
        {
            int f=0;
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    f=f+1;
                }
            }

            if(f==2)
            {
                System.out.println(i);
            }
        }   
    }
}