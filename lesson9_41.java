/*Write a menu driven program to accept a number from the user and check whether
it is ‘BUZZ’ number or to accept any two numbers and print the ‘GCD’ of them.
a. A BUZZ number is the number which either ends with 7 or divisible by 7.
b. GCD (Greatest Common Divisor) of two integers is calculated by continued 
division method. Divide the larger number by the smaller; the remainder then 
divides the previous divisor. The process is repeated till the remainder is zero. 
The divisor then results the GCD.*/
import java.util.*;
class lesson9_41
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int ch, n, r = 0, a, b;
        System.out.println("---MENU---");
        System.out.println("1.Buzz Number");
        System.out.println("2.GCD");
        System.out.println("Enter your choice: ");
        ch = sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("Enter a number: ");
                n = sc.nextInt();
                if(n % 7 == 0 || n % 10 == 7)
                    System.out.println("Buzz Number");
                else
                    System.out.println("Not a Buzz Number");
            break;
            case 2:
                System.out.println("Enter 2 numbers: ");
                a = sc.nextInt();
                b = sc.nextInt();
                for(r = a % b; r > 0; r = a % b)
                {
                    a = b;
                    b = r;
                    System.out.println("GCD: " +b);
                }
            break;
            default:
                System.out.println("Invalid choice");
        }
    }
}   
