/*Write a program to enter an alphabet and display its ASCII Value*/
import java.util.*;
class ascii
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int a;
        char ch;
        System.out.println("Enter an alphabet");
        ch = sc.next().charAt(0);
        a = (int)ch;
        System.out.println("ASCII Value: "+a);
    }
}