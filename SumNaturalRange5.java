//Sum of numbers in a given range.
import java.util.*;
public class SumNaturalRange5
{
    public static void main(String args[]) 
    {
        Scanner in=new Scanner(System.in);
        int m,n,i,sum=0;
        System.out.println("Enter the value of M and N:");
        m=in.nextInt();
        n=in.nextInt();
        if(m<n)
        {
            for(i=m;i<=n;i++)
            {
                sum=sum+i;
            }
            System.out.println("The Sum between "+m+" and "+n+" is: "+sum);
        }
        else
        {
            for(i=n;i<=m;i++)
            {
                sum=sum+i;
            }
            System.out.println("The Sum between "+n+" and "+m+" is: "+sum);
        }
        
    }
}
