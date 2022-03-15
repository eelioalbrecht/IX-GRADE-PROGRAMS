/*Write a program to input the temperature in Fahrenheit and change it to Celsius.
Note: The relation between Fahrenheit and Celsius is given by the formula:
Where C=Celsius and F=Fahrenheit*/
import java.util.*;
class lesson6eleven
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        float f, c;
        System.out.println("Enter temperature in farenheit:");
        f = sc.nextFloat();
        c = ((f - 32) * 5) / 9;
        System.out.println("Temperature in celcius=" +c);
    }
}