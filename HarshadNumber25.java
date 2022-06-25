import java.util.*;
public class HarshadNumber25
{
    public static void main(String args[]) 
    {
        Scanner in=new Scanner(System.in);
        int num,num1,sum=0,d=0;
        System.out.println("Enter a Number:");
        num=in.nextInt();
        num1=num;
        while(num1>0)
        {
            d=num1%10;
            sum=sum+d;
            num1=num1/10;
        }

        if((num==0) || (num%sum==0))
            System.out.println(num+" is a Harshad Number.");
        else
            System.out.println(num+" is not a Harshad Number.");   
    }
}