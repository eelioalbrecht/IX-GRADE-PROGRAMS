/*Write a program to input an integer and using ternary operator check 
whether it is a multiple of 5 or not.*/





import java.util.*;
class lesson8_24
{
    public static void main(String [] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        n = sc.nextInt();
        System.out.println((n % 5 == 0) ? "Multiple of 5" : "Not a multiple of 5");   
    }
}