/*Write a program to input an integer and using ternary operator check whether
it is an Even or an Odd number.*/
import java.util.*;
class lesson8_23
{
    public static void main(String [] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        n = sc.nextInt();
        System.out.println((n % 2 == 0) ? "Even" : "Odd");
    }
}