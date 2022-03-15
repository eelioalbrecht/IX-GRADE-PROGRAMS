/*Write a program to check whether an int type number (taken as input) is 
a multiple of 5 or not.*/






import java.util.*;
class lesson8_7
{
    public static void main(String [] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        n = sc.nextInt();
        if(n % 5 == 0)
            System.out.println("Multiple of 5");
        else
            System.out.println("Not a multiple of 5");
    }
}