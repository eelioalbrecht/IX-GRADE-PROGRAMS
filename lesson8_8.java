/*Write a program to check whether an int type number (taken as input) is a 
2-digit number or not.*/






import java.util.*;
class lesson8_8
{
    public static void main(String [] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        n = sc.nextInt();
        if(n >= 10 && n <= 99 || n >= -99 && n <= -10)
            System.out.println("2-digit number");
        else
            System.out.println("Not a 2-digit number");
    }
}