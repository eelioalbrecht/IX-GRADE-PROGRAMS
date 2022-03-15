/*A number n is said to be a Sunny number if, √n+1 is equal to an integer. 
For example, 8 is sunny as √8+1 =3 which is an integer. Write a program to 
input a number and using ternary operator check whether it is a sunny number 
or not*/
import java.util.*;
class lesson7twelve
{
    public static void main()
    {
        int n;
        double s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integers: ");
        n = sc.nextInt();
        s = Math.sqrt(n + 1);
        System.out.println((s == (int) s)? "Sunny Number": "Not a Sunny Number");
    }
}