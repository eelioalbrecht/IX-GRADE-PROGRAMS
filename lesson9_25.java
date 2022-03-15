/*Write a program to input an integer and check whether it is perfect, abundant
or deficient number. If the sum of the factors excluding itself is equal to 
that number it is perfect, if greater than that number it is abundant and if 
less than that number it is deficient number.*/
import java.util.*;
class lesson9_25
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int i, n, s = 0;
        System.out.println("Enter an integer: ");
        n = sc.nextInt();
        for(i = 1; i < n; i++)
        {
            if(n % i == 0)
                s += i;
        }
        if(s == n)
            System.out.println("Perfect Number");
        else if(s > n)
            System.out.println("Abundant Number");
        else
            System.out.println("Deficient Number");
    }
}