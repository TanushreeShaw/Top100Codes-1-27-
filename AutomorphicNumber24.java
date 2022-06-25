import java.util.*;
public class AutomorphicNumber24
{
    public int Automorphic(int num) 
    {
        long square;
        square=num*num;
        while(num>0)
        {
            if(num%10 != square%10)
            {
                return 0;
            }
            else
            {
                num=num/10;
                square=square/10;
            }
        }
        return 1;
    }
    public static void main(String args[]) 
    {
        Scanner in=new Scanner(System.in);
        int auto=0;
        int num;
        System.out.println("Enter a Number:");
        num=in.nextInt();
        AutomorphicNumber24 ob=new AutomorphicNumber24();
        auto=ob.Automorphic(num);
            if(auto==1)
                System.out.println(num+" is an Automorphic Number.");
            else
                System.out.println(num+" is not an Automorphic Number.");
    }
}
