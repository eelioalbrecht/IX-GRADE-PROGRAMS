/*Write a program to input a number and check whether it is a Kaprekar number
or not. Take a positive whole number n that has d number of digits. Take the 
square n and separate the result into two pieces: a right-hand piece that has
d digits and a left-hand piece that has either d or d-1 digits. Add these two
pieces together. If the result is n, then n is a Kaprekar number.
Examples are 9 (9^2 = 81, 8 + 1 = 9), 45 (45^2 = 2025, 20 + 25 = 45), and 297
(297^2 = 88209, 88 + 209 = 297).*/
import java.util.*;
class lesson9_37
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int i, d = 0, a, s = 0, f, l;
        System.out.println("Enter an integer");
        a = sc.nextInt();
        for(i = a; i > 0; i /= 10)
        {
            d++;
        }
        s = a * a;
        f = s / (int)Math.pow(10, d);
        l = s % (int)Math.pow(10, d);
        if (f + l == a)
            System.out.println("Kaprekar Number");
        else 
            System.out.println("Not a Keprekar Number");
    }
}