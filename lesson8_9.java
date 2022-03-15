/*Write a program to check whether an int type number (taken as input) 
is a 3-digit number divisible by three or not*/
import java.util.*;
class lesson8_9
{
    public static void main(String [] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer: ");
        n = sc.nextInt();
        if((n >= 100 && n <= 999 || n >= 999 && n <= -100) && n % 3 == 0)
            System.out.println("3-digit number divisible by 3");
        else
            System.out.println("Not a 3-digit number or divisible by 3");
    }
}