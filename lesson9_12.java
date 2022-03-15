import java.util.*;
class lesson9_12
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int i, n, c = 0, l = 0;
        System.out.println("Enter 10 integers: ");
        for(i = 1; i <= 10; i++)
        {
            n = sc.nextInt();
            c++;
            if(c == 1)
                l = n;
            if(n > l)
                l = n;
        }
        System.out.println("Largest number: " +l);
    }
}