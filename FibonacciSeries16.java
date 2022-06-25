import java.util.*;
public class FibonacciSeries16
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,a=0,b=1,c=0,num;
        System.out.println("Enter the range:");
        num=in.nextInt();
        System.out.println("The Fibonacci Numbers are:");
        System.out.println(a);
        System.out.println(b);
        for(i=3;i<=num;i++)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    } 
}