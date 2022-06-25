import java.util.*;
public class PerfectNumber23
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,num,sum=0;
        System.out.println("Enter a Number:");
        num=in.nextInt();
        
        for(i=1;i<num;i++)
        {
            if(num%i==0)
            {
                sum=sum+i;
            }
        }
        
        if((sum==num) || (num==1))
            System.out.println(num+" is a Perfect Number.");
        else
        System.out.println(num+" is not a Perfect Number.");
    }
}
