/*Write a program to input the length and breadth of a rectangle and find 
its diagonal.
diagonal = length + breadth 2 2*/
import java.util.*;
class lesson7two
{
    public static void main()
    {
        double length, breadth, diagonal;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth of the rectangle: ");
        length = sc.nextDouble();
        breadth = sc.nextDouble();
        diagonal = Math.sqrt(length * length * breadth * breadth);
        System.out.println("Diagonal: "+diagonal);
    }
}