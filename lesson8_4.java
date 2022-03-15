/*Write a program to check whether a short type number taken as input is an 
even number oran odd number.*/
import java.util.*;
class lesson8_4
{
    public static void main(String [] args)
    {
        short n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextShort();
        if(n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}