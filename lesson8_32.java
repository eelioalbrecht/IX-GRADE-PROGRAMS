/*The 1st day of 2010 was Friday, write a program to input any day number 
within the month of January and print which day was it. Also check whether 
the day number entered is a valid date or not.
For example,
Input: Enter day number: 20
Output: Wednesday
Input: Enter day number:30
Output: Saturday
Input: Enter day number:34
Output: Invalid day number*/
import java.util.*;
class lesson8_32
{
    public static void main(String [] args)
    {
        int d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day number of the month of January: ");
        d = sc.nextInt();
        if(d >= 1 && d <= 7)
        {
            switch(d % 7)
            {
                case 1:
                System.out.println("Friday");
                break;
                case 2:
                System.out.println("Saturday");
                break;
                case 3:
                System.out.println("Sunday");
                break;
                case 4:
                System.out.println("Monday");
                break;
                case 5:
                System.out.println("Tuesday");
                break;
                case 6:
                System.out.println("Wednesday");
                break;
                case 0:
                System.out.println("Thursday");
                break;
                default:
                System.out.println("Invalid input");
            }
        }
        else
            System.out.println("Invalid day number");
    }
}