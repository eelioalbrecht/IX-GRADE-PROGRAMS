/*Using a switch statement, write a menu driven program to find the area 
and perimeter of a square or rectangle. For finding the area and 
perimeter of a square input the side length and for finding the area 
and perimeter of the rectangle input the length and breadth.*/
import java.util.*;
class lesson8_27
{
    public static void main(String [] args)
    {
        int ch, s, a, p, l, b;
        Scanner sc=new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("1.Area/Perimeter of a square");
        System.out.println("2.Area/Perimeter of a rectangle");
        System.out.println("Enter your choice: ");
        ch = sc.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println("Enter the side of a square: ");
            s = sc.nextInt();
            a = s * s;
            p = 4 * s;
            System.out.println("Area: "+a);
            System.out.println("Perimeter: "+p);
            break;
            case 2:
            System.out.println("Enter the length and breadth of a rectangle: ");
            l = sc.nextInt();
            b = sc.nextInt();
            a = l * b;
            p = 2 * (l + b);
            System.out.println("Area: "+a);
            System.out.println("Perimeter: "+p);
            break;
            default:
            System.out.println("Invalid choice");
        }   
    }
}