//Sum of digits of a number using Java
import java.util.*;
public class SumofDigits11
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
            sum=sum+d;
            num1=num1/10;

        }
        System.out.println("The Sum of the Digits of the Number "+num+" is : "+sum);
    }
}
