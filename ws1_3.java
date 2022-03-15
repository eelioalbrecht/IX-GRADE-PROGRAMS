import java.util.*;
class ws1_3
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int i, d, a, c = 0;
        System.out.println("Enter an integer: ");
        a = sc.nextInt();
        for (i = a; i > 0; i /= 10)
        {
            c++;
        }
        if((a * a) % (int) Math.pow(10, c) == a)
            System.out.println("Automorphic Number");
        else
            System.out.println("Not an Automorphic Number");
    }
}