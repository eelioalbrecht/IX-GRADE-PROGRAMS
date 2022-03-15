/*A special two-digit number is such that when the sum of its digits is 
added to the product of its digits, the result is equal to the original
two-digit number.
Example:
Consider the number 59.
Sum of digits= 5 + 9 = 14
Product of its digits = 5 x 9 =45
Sum of the sum of digits and product of digits = 14 + 45 = 59
Write a program to accept a two-digit number. Add the sum of its digits 
to the product of its digits. If the value is equal to the number input, 
ouput the message â€œSpecial 2-digit numberâ€ otherwise, output the message 
â€œNot a special 2-digit numberâ€?*/
import java.util.*;
class lesson8_22
{
    public static void main(String [] args)
    {
        int n, f, l, s, p;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        n = sc.nextInt();
        if(n >= 10 && n <= 99)
        {
            f = n / 10;
            l = n % 10;
            s = f + l;
            p = f * l;
            if(s + p == n)
                System.out.println("Special 2-digit number");
            else
                System.out.println("Not a special 2-digit number");
        }
        else
        System.out.println("Not a 2 digit number");
    }
}