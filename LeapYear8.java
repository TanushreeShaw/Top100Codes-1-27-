import java.util.*;
public class LeapYear8
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int year=0;
        System.out.println("Enter a Year:");
        year=in.nextInt();

        if((year%400==0) || (year%4==0 && year%100!=0))
        {
            System.out.println(year+" is a Leap Year.");
        }
        else
        {
            System.out.println(year+" is not a Leap Year.");
        }
    }
}
