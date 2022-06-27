//Positive or Negative number.
import java.util.*;
public class PositiveNegative1
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int num,i=0;

        do
        {
        System.out.println("Enter the value of num:");
        num=in.nextInt();
        if(num>0)
        System.out.println("It is a Positive Number.");
        else if(num<0)
        System.out.println("It is a Negative Number.");
        else
        System.out.println("It is neither a Positive nor a Negative Number.");
        }
        while(num!=0);
    }
}
