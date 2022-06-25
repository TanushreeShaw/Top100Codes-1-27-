import java.util.*;
public class GreatestNumber6
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the two numbers (A and B) :");
        a=in.nextInt();
        b=in.nextInt();
        if(a>b)
        {
            System.out.println("A is Greater than B.");
        }
        else if(b>a)
        {
            System.out.println("B is Greater than A.");
        }
        else
        {
            System.out.println("Both the numbers are Equal.");
        }
    }  
}
