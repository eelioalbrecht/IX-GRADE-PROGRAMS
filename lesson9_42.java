/*Write a menu driven program to accept a number and check and display whether
it is a Prime Number or not OR an Automorphic Number or not.

a. Prime number : A number is said to be a prime number if it is divisible only
by 1 and itself and not by any other number. Example : 3,5,7,11,13 etc.

b. Automorphic number : An automorphic number is the number which is contained
in the last digit(s) of its square.

Example: 25 is an automorphic number as its square is 625 and 25 is present as
the last two digits.*/
import java.util.*;
class lesson9_42
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int ch, i, c = 0, n;
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        System.out.println("---MENU---");
        System.out.println("1.Prime Number");
        System.out.println("2.Automorphic Number");
        System.out.println("Enter your choice: ");
        ch = sc.nextInt();
        switch(ch)
        {
            case 1:
                for(i = 1; i <= n; i++)
                {
                    if(n % i == 0)
                        c++;
                }
                if(c == 2)
                    System.out.println("Prime Number");
                else
                    System.out.println("Not a Prime Number");
            break;
            case 2:
                for(i = n; i > 0; i /= 10)
                {
                    c++;
                }
                if((n * n) % (int)Math.pow(10, c) == n)
                    System.out.println("Automorphic Number");
                else
                    System.out.println("Not an Automorphic Number");
            break;
            default:
                System.out.println("Invalid choice");
        }
        System.out.println("----------");
    }
}