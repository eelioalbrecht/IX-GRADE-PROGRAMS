/*write a program to find the rate for the telegram with the help of the 
criteria given below
Words                       Rate    
Upto 15 words               Rs 5
Each additional word        Rs 1*/
import java.util.*;
class telegram
{
    public static void mai(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int w;
        System.out.println("Enter the number of words");
        w = sc.nextInt();
        int r;
        if(w <= 15)
            r = w * 5;
        else
            r = (w * 5) + (w - 15) * 1;
        System.out.println("Rate: " +r);
    }
}