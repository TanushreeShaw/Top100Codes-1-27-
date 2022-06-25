import java.util.*;

public class EvenOdd2
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int num,i=0;

        do
        {
        System.out.println("Enter the value of num: Press 0 to Exit.");
        num=in.nextInt();
        if(num%2==0)
        System.out.println("It is an Even Number.");
        else
        System.out.println("It is an Odd Number.");
        }
        while(num!=0);
    }
}