/*Write a program to input three integers and check whether all of them are 
unique (different) from each other or not.*/
import java.util.*;
class lesson8_12
{
    public static void main(String [] args)
    {
    int a, b, c;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 3 Integers: ");
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    if(a != b && b != c && a != c)
        System.out.println("All are unique");
    else
        System.out.println("All are not unique");
    }
}