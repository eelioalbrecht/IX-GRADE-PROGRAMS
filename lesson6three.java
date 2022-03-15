/*Write a program to input two integers using Scanner and find the product of their sun and difference*/
import java.util.*;
class lesson6three
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        int a, b;
        System.out.println("Enter Any Two Numbers: ");//prompting
        a = sc.nextInt();
        b = sc.nextInt();
        int c = a + b;
        int d = a - b;
        int e = c * d;
        System.out.println("Product: "+e);
    }
}