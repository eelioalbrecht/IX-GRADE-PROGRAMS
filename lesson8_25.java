/*Write a program to input an integer and using ternary operator check 
whether it is a positive number , negative number or a zero or not.*/
import java.util.*;
class lesson8_25
{
    public static void main(String [] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        n = sc.nextInt();
        System.out.println((n > 0) ? "Positive" : (n < 0) ? "Negative" : "Zero");
    }
}