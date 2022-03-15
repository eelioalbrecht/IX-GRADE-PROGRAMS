import java.util.*;
class num
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner (System.in);
        int a, b;
        System.out.println("Enter Any Two Numbers: ");//prompting
        a = sc.nextInt();
        b = sc.nextInt();
        int c = a + b;
        System.out.println("The Sum Of The Given Numbers Are: "+c);
    }
}