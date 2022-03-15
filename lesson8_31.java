/*Write a program to input an integer and check whether it is divisible by 
3 or not using swich case only (no if-else statement).*/
import java.util.*;
class lesson8_31
{
    public static void main(String [] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number in the range 1-12: ");
        n = sc.nextInt();
        switch(n % 3)
        {
            case 0:
            System.out.println("Divisible by 3");
            break;
            default:
            System.out.println("Not divisible by 3");
        }   
    }
}