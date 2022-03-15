/*Write a program to input three integers and check whether it forms a 
Pythagorean triplet or not. A set of three integers is said to be a 
Pythagoren triplet if the sum of the squares of any two integers is 
equal to square of the third integer. Example, (3, 4, 5), (5, 12, 13), 
and (7, 24, 25).*/
import java.util.*;
class lesson8_36
{
    public static void main(String [] args)
    {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 integers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b)
        System.out.println("Pythagorean Triplet");
        else
        System.out.println("Not a Pythagorean triplet");
    }
}