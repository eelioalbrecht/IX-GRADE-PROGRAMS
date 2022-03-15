/*Write a program to input time in seconds. Display the time after converting them into hours, minutes and seconds*/
import java.util.*;
class time2seconds
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Time:");
        double input = sc.nextDouble();
        double hrs = input / 3600;
        double min = (input % 3600) / 60;
        double sec = (input % 3600) % 60;
        System.out.println("Format: hh:mm:ss");
        System.out.println(hrs+":"+min+":"+sec);
    }
}