//Sum of N natural numbers.
import java.util.*;
public class FirstNNaturalNumbers4 
{
    public static void main(String args[]) 
    {
        Scanner in=new Scanner(System.in);
        int n,i,sum=0;
        System.out.println("Enter the value of N:");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("The Sum is: "+sum);
    }
}
