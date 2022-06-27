//Greatest of the Three numbers.
import java.util.*; 
public class GreatestThree7
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the three numbers (A, B and C) :");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        
        if((a>b) && (a>c))
        {
            System.out.println("A is Greater than B and C.");
        }
        else if((b>a) && (b>c)) 
        {
            System.out.println("B is Greater than A and C.");
        }
        else if ((c>a) && (c>b))
        {
            System.out.println("C is Greater than A and B.");
        }
        else
        {
            System.out.println("All the Numbers are Equal.");
        }
    }
    
}
