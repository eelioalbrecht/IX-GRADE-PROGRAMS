/*Write a program to check whether a int type number taken as input is a 
positive, negative or a zero.*/
import java.util.*;
class lesson8_3
{
    public static void main(String args [])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        if(n > 0)
            System.out.println("Positive");
        else if(n < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
    }
}