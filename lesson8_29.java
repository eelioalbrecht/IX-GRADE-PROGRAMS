/*Write a menu driven program to input a day number between 1 to 7 and print
the corresponding weekday. That is for 1 display Sunday, for 2 display 
Monday for 3 display Tuesday, etc.*/
import java.util.*;
class lesson8_29
{
    public static void main(String [] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number in the range 1-7: ");
        n = sc.nextInt();
        switch(n)
        {
            case 1:
            System.out.println("Sunday");
            break;
            case 2:
            System.out.println("Monday");
            break;
            case 3:
            System.out.println("Tuesday");
            break;
            case 4:
            System.out.println("Wednesday");
            break;
            case 5:
            System.out.println("Thursday");
            break;
            case 6:
            System.out.println("Friday");
            break;
            case 7:
            System.out.println("Saturday");
            break;
            default:
            System.out.println("Invalid input");
        }
    }
}