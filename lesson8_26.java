/*Using a switch statement, write a menu driven program to convert a given 
temperature from Fahrenheit to Celsius and vice versa. For an incorrect 
choice, an appropriate error message should be displayed.
(HINT : C =5/4xCF−32) and F=1.8×C+32*/
import java.util.*;
class lesson8_26
{
    public static void main(String [] args)
    {
        int ch;
        float f, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("1.Farenheit to Celcius");
        System.out.println("2.Celcius to Farenheit");
        System.out.println("Enter your choice: ");
        ch = sc.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println("Enter the temperature in farenheit: ");
            f = sc.nextFloat();
            c = 5 / 9f * (f - 32);
            System.out.println("Celcius: "+c);
            break;
            case 2:
            System.out.println("Enter the temperature in celcius: ");
            c = sc.nextFloat();
            f = 1.8f * c + 32;
            System.out.println("Farenheit: "+f);
            break;
            default:
            System.out.println("Invalid choice");
        }
    }
}