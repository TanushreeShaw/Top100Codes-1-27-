import java.util.*;
public class ArmstrongNumberinRange15
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int num,d=0,sum=0,n1,n2,i;
        System.out.println("Enter a Range Value N1 and N2:");
        n1=in.nextInt();
        n2=in.nextInt();
        System.out.println("The Palindrome Numbers in the given Range are: ");
        for(i=n1;i<=n2;i++)
        {
            num=i;
            sum=0;
            
            while(num!=0)
            {
                d=num%10;
                sum=sum+(d*d*d);
                num=num/10;
            }

            if(sum==i)
            {
                System.out.println(i);
            }
        }
    }
}