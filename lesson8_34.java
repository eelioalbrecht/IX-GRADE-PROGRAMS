/*Write a menu-driven program to check whether a number is 
i) Even or odd,
ii) Multiple of 17 or not, 
iii) Two digit number or not.*/
import java.util.*;
class lesson8_34
{
    public static void main(String [] args)
    {
        int ch, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        System.out.println("MENU");
        System.out.println("1.Even or odd");
        System.out.println("2.Multiple of 17 or not");
        System.out.println("3.2 digit number or not");
        System.out.println("Enter your choice:");
        ch = sc.nextInt();
        switch(ch)
        {
            case 1:
            if(n % 2 == 0)
                System.out.println("Even");
            else
                System.out.println("Odd");
            break;
            case 2:
            if(n % 17 == 0)
                System.out.println("Multiple of 17");
            else
                System.out.println("Not a multiple of 17");
            break;
            case 3:
            if(n >= 10 && n <= 99)
                System.out.println("2 digit number");
            else
                System.out.println("Not a 2-digit number");
            break;
            default:
            System.out.println("Invalid choice");
        }
    }
}