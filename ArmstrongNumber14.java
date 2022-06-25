import java.util.*;
public class ArmstrongNumber14
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int num,d=0,sum=0;
        System.out.println("Enter a Number:");
        num=in.nextInt();
        int num1=num;
        while(num1!=0)
        {
            d=num1%10;
            sum=sum+(d*d*d);
            num1=num1/10;
        }
        if(num==sum)
            System.out.println("The given Number is Armstrong Number: "+num);
        else
            System.out.println("The given Number is Not an Armstrong Number: "+num);
    }
}