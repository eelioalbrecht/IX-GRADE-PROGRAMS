/*Write a program to input an integer and check whether it is an automorphic, 
trimorphic or tri-automorphic number or not. A number n is said to be 
automorphic, if its square ends in n. For instance 5 is automorphic, because 5^2
= 25, which ends in 5, 25 is automorphic, because 252 =625, which ends in 25.
A number n is called trimorphic if n^3 ends in n. For example 49^3, = 117649,
is trimorphic. A number n is called tri-automorphic if 3n^2 ends in n;
for example 667 is tri-automorphic because 3 × 667^2, = 1334667, ends in 667.*/
import java.util.*;
class lesson9_35
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int i, d, a, c = 0;
        System.out.println("Enter an integer: ");
        a = sc.nextInt();
        for(i = a; i > 0; i /= 10)
        {
            c++;
        }
        if ((Math.pow(a, 2)) % (int)Math.pow(10, c) == a)
            System.out.println("Automorphic Number");
        else if ((Math.pow(a, 3)) % (int)Math.pow(10, c) == a)
            System.out.println("Trimorphic Number");
        else if ((3 * a * a) % (int)Math.pow(10, c) == a)
            System.out.println("Tri-Automorphic Number");
        else
            System.out.println("Not any type of Automorphic Number");
    }
}