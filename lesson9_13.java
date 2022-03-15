import java.util.*;
class lesson9_13
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int i, n, c = 0, l = 0, s = 0;
        System.out.println("Enter 2 integers: ");
        for(i = 1; i <11; i++)
        {
            n = sc.nextInt();
            c++;
            if(c == 1)
            s = l = n;
            if(n > l)
            l = n;
            if(n < s)
            s = n;
        }
        System.out.println("Largest Number: " +l);
        System.out.println("Smallest Number: " +s);
    }
}