import java.util.*;
public class FriendlyPair27
{
    public static void main(String args[]) 
    {
        Scanner in=new Scanner(System.in);
        int num1,num2,i,j,sum1=0,sum2=0;
        System.out.println("Enter First Number:");
        num1=in.nextInt();
        System.out.println("Enter Second Number:");
        num2=in.nextInt();

        for(i=1;i<num1;i++)
        {
            if(num1%i==0)
                sum1=sum1+i;
        }

        for(j=1;j<num2;j++)
        {
            if(num2%j==0)
                sum2=sum2+j;
        }

        if(((num1==0 && num2==0) || (num1==1 && num2==1) || ((num1==sum1) && (num2==sum2))))
            System.out.println(num1+" and "+num2+" are Friendly Pairs.");
        else
            System.out.println(num1+" and "+num2+" are not Friendly Pairs.");
    }
}