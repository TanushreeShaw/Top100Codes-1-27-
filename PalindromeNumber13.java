import java.util.*;
public class PalindromeNumber13
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int num,d=0,rev=0;
        System.out.println("Enter a Number:");
        num=in.nextInt();
        int num1=num;
        while(num1!=0)
        {
            d=num1%10;
            rev=rev*10+d;
            num1=num1/10;

        }

        if(num==rev)
            System.out.println(num+" is a Palindrome Number.");
        else
            System.out.println(num+" is not a Palindrome Number.");
    }
}