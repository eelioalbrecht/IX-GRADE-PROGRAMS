/*Write a program to input the time in hours, minutes and seconds and print it in seconds.
For Example:
INPUT: Enter time in hours:
 1
Enter time in minutes:
 12
Enter time in seconds:
 6
OUTPUT:
Time in seconds:4326*/
import java.util.*;
class lesson6sixteen
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int h, m, s, sec;
        System.out.println("Enter time in hours:");
        h = sc.nextInt();
        System.out.println("Enter time in minutes:");
        m = sc.nextInt();
        System.out.println("Enter time in seconds:");
        s = sc.nextInt();
        sec = h * 3600 + m * 60 + s;
        System.out.println("Time in seconds:" +sec);
    }
}