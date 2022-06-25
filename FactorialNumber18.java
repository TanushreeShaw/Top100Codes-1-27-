import java.util.*;
public class FactorialNumber18
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int num,i;
        long fact=1;
        System.out.println("Enter a Number:");
        num=in.nextInt();
        
        if(num<0)
            System.out.println ("Value is not defined, please re-enter the value");
        else
        {
            fact=1;
            for(i=1;i<=num;i++)
            {
                fact=fact*i;
            }
            System.out.println("Factorial of "+num+" is: "+fact);
        }
    }
}