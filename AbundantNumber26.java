import java.util.*;
public class AbundantNumber26
{
    public static void main(String args[]) 
    {
        Scanner in=new Scanner(System.in);
        int num,i,sum=0;
        
        System.out.println("Enter a Number:");
        num=in.nextInt();
        
        for(i=1;i<num;i++)
        {
            if(num%i==0)
            {
                sum=sum+i;
            }
        }
        
        if(sum>num)
            System.out.println(num+" is an Abundant Number.");
        else
            System.out.println(num+" is not an Abundant Number.");
    }
}

        