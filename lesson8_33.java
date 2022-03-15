/*Write a program to input an integer and check whether it is a magic number
or not. A Magic number is such a number whose continous sum of the digits 
until it forms a single digit is 1. For example [55]=5+5=[10]=1+0=[1],
therefore 55 is a Magic Number. (Remember no loops is to be used).*/
import java.util.*;
class lesson8_33
{
    public static void main(String [] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        n = sc.nextInt();
        if(n % 9 == 1)
            System.out.println("Magic number");
        else
            System.out.println("Not a magic number");
    }
}