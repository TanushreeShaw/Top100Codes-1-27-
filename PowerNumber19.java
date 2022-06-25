import java.util.*;
public class PowerNumber19
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int num,len=0,n,d;
        //int power=1;
        double power = 0.0;
        String str="";
        System.out.println("Enter a 2 Digit Number:");
        num=in.nextInt();
        str=Integer.toString(num);
        len=str.length();
        if((num>=0) && ((len>2) || (len<2)) || ((num<0) && (len<=2)))
        {
            System.out.println("Invalid Input! Try Again!");
        }
        else
        {
            d=num%10;
            n=num/10;
            power=Math.pow(n,d);
            /*while (d != 0)
            {
	            power = power * n;
	            --d;
            }*/
            System.out.println("The Resulting Value is: "+((int)power));
        }
    }
}