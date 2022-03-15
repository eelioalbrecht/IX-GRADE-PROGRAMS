/*Question*/
import java.util.*;
class final6
{
    void calculate()
    {
        Scanner sc = new Scanner(System.in);
        int ch;
        double l, b, area, perimeter, dg;
        System.out.println("---MENU---");
        System.out.println("1. Area of Rectangle");
        System.out.println("2. Perimeter of Rectangle");
        System.out.println("3. Digonal of Rectangle");
        System.out.println("Enter your Choice");
        ch = sc.nextInt();
        System.out.println("Enter Length: ");
        l = sc.nextDouble();
        System.out.println("Enter Breadth: ");
        b = sc.nextDouble();
        switch(ch)
        {
            case 1:
                area = l * b;
                System.out.println("Area: " +area);
            break;
            case 2:
                perimeter = 2 * (l + b);
                System.out.println("Perimeter: " +perimeter);
            break;
            case 3:
                dg = Math.sqrt(Math.pow(l, 2) + Math.pow(b, 2));
                System.out.println("Diagonal: " +dg);
            break;
            default:
                System.out.println("!INVALID INPUT!");
        }
    }
    public static void main(String [] args)
    {
        final6 obj = new final6();
        obj.calculate();
    }
}
