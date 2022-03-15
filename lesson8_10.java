/*Write a program to input an integer and check whether it is a 2-digit or a 
3-digit number or not. Incase it is not a 2-digit or a 3-digit number a
relevant message ("Not 2 or 3 digit number") should be displayed.*/
import java.util.*;
class lesson8_10
{
    public static void main(String [] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer: ");
        n = sc.nextInt();
        if(n >= 100 && n <= 999 || n >= -999 && n<= -100)
            System.out.println("3-digit number");
        else
            System.out.println("Not a 2 or 3-digit number");
    }
}