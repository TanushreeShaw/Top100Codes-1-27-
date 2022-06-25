import java.util.*;
public class StrongNumber22
{
    public int factorial(int num)
    {
        int fact;
        if(num==0)
            return 1;
        else
        {
            fact=num*(factorial(num-1));
            return fact;
        }
    }
        public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        int num,d=0,sum=0,num1=0, fact=0;
        System.out.println("Enter a Number:");
        num=in.nextInt();
        num1=num;
        StrongNumber22 ob = new StrongNumber22();
        while(num1>0)
        {
            d=num1%10;
            fact=ob.factorial(d);
            sum=sum+fact;
            num1=num1/10;
        }
        if((sum!=num) || (num==0))
            System.out.println(num+" is not a Strong Number.");
        else   
            System.out.println(num+" is a Strong Number.");
    }
}