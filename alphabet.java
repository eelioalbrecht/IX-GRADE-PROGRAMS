/*Write a program to accept an alphabet and two numbers. Use ternary operator to check whether the given letter is S then add the two numbers 
otherwise subtract*/
import java.util.*;
class alphabet 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Alphabet: ");
        char ch = sc.next().charAt(0);
        System.out.println("Enter a Number: ");
        int a = sc.nextInt();
        System.out.println("Enter another Number: ");
        int b = sc.nextInt();
        int check = (ch == 'S')/*|| (ch == 's')*/? a+b : a-b;
        System.out.println("Result: " +check);
    }
}
