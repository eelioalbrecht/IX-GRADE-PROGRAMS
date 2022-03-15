/*Write a program to enter the perimeter of a square and find its perimeter.
For Example,
INPUT:
  Enter the perimeter of a square: 64
OUTPUT:
  Area of the square is: 256*/
import java.util.*;
class lesson6eighteen
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        float perimeter, side, area;
        System.out.println("Enter the perimeter of a square: ");
        perimeter = sc.nextInt();
        side = perimeter / 4; 
        area = side * side;
        System.out.println("Area of the square is: " +area);
    }
}