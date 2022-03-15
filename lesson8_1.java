/*Write a program to input an integer and check whether it is greater 
than 100, or less than 100 or equal to 100*/
import java.util.*;
class lesson8_1
{
    public static void main(String [] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        n = sc.nextInt();
        if(n > 100)
            System.out.println("Greater than 100");
        else if(n < 100)
            System.out.println("Less than 100");
        else
            System.out.println("Equal to 100");
    }
}