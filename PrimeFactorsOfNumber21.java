import java.util.*;
public class PrimeFactorsOfNumber21 
{
    public static int Prime(int num)
    {
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                return 0;
            }
        }
        return 1;
    }

    public static void PrimeFactors(int num)
    {
        for(int i=2;i<=num;i++)
        {
            if(Prime(i)==1)
            {
                while(num%i==0)
                {
                    System.out.println(i+" ");
                    num=num/i;
                }
            }
        }
    }

    public static void main(String args[]) 
    {
        Scanner in=new Scanner(System.in);
        int num;
        System.out.println("Enter a Number to generate its Prime Factors:");
        num=in.nextInt();
        System.out.println("Prime Factors are:");
        PrimeFactors(num);
    }
}