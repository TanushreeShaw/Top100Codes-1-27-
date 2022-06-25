import java.util.*;
public class FactorNumber20
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int num,i;
        System.out.println("Enter a Number:");
        num=in.nextInt();
        System.out.println("The Factors of the Number are:");

        for(i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                System.out.println(i);
            }
        }
    }
}