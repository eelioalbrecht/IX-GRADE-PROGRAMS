/*Write a program to input 2 integers and check whether both the numbers are 
multiples of 7 or not.*/
import java.util.*;
class lesson8_11
{
    public static void main(String [] args)
    {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 Integers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        if(a % 7 == 0 && b % 7 == 0)
            System.out.println("Both are multiples of 7");
        else
            System.out.println("Both are not multiples of 7");
    }
}