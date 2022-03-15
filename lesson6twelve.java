/*Write a program to input time in seconds and display the time broken up as hours, minutes
and seconds.
For Example:
INPUT: Enter Time in Seconds: 4326
OUTPUT:
Time in hours:1
Time in minutes:12
Time in seconds:6*/
import java.util.*;
class lesson6twelve
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int sec, h, m, s;
        System.out.println("Enter time in seconds:");
        sec = sc.nextInt();
        h = sec / 3600; //finding hours
        sec = sec % 3600; //remaining seconds
        m = sec / 60; //finding minutes
        s = sec % 60; //remaining seconds
        System.out.println("Time in hours=" +h);
        System.out.println("Time in minutes=" +m);
        System.out.println("Time in seconds=" +s);
    }
}