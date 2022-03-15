/*Write a program to input two integers and find their 
Least Common Multiple(L.C.M).
For Example,
    INPUT: Enter 2 integers:
        12
        8
    OUTPUT: L.C.M. = 24*/
import java.util.*;
class lesson9_38
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int i, a, b, l = 0;
        System.out.println("Enter 2 integers");
        a = sc.nextInt();
        b = sc.nextInt();
        for(i = a; i <= a * b; i++)
        {
            if (i % a == 0 && i % b == 0)
            {
                l = i;
                break;
            }
        }
        System.out.println("L.C.M.: " +l);
    }
}