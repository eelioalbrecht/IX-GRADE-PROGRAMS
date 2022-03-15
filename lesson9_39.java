/*Write a program to input two integers and find their 
Highest Common Factor(H.C.F).
For Example,
    INPUT: Enter 2 integers:
        12
        8
    OUTPUT: H.C.F. = 4*/
import java.util.*;
class lesson9_39
{
    public static void main(String [] srgs)
    {
        Scanner sc = new Scanner(System.in);
        int i, a, b, h = 0;
        System.out.println("Enter 2 integers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        for(i = a; i >= 1; i--)
        {
            if (a % i == 0 && b % i == 0)
            {
                h = i;
                break;
            }
        }
        System.out.println("H.C.F.: " +h);
    }
}