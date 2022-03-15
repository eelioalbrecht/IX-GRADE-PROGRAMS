/*Write a program to input the area of a square and find its perimeter*/
import java.util.*;
class lesson7one
{
    public static void main()
    {
        double area, perimeter, side;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the area of the square: ");
        area = sc.nextDouble();
        side = Math.sqrt(area);
        perimeter = 4 * side;
        System.out.println("Perimeter: "+perimeter);
    }
}