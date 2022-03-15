/*Write a program to pass an integer as argument and check whether it is 
Armstrong number or not. Numbers whose sum of the cube of its digit is equal 
to the number itself is called Armstrong numbers. Example 153=1^3+5^3+3^3.*/
import java.util.*;
class lesson9_34_2
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int i, d, n = 0; 
        double sum = 0;
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        while (a > 0)
        {
            d = a % 10;
            sum = Math.pow(d, 3);
            n /= 10;
        }
        if(sum == a)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not a Armstrong Number");
    }
}