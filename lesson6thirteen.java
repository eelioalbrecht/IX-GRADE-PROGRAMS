/*Write a program to input a floating point number and round it off to the 
nearest integer.
For Example:
INPUT: Enter a floating point number: 12.3
OUTPUT: Rounded off to nearest integer:12
INPUT: Enter a floating point number: 14.5
OUTPUT: Rounded off to two places of decimal:15*/
import java.util.*;
class lesson6thirteen
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        float n;
        int r;
        System.out.println("Enter a floating point number:");
        n = sc.nextFloat();
        r = (int)(n+0.5f);
        System.out.println("Answer=" +r);
    }
}