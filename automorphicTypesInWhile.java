import java.util.*;
class automorphicTypesInWhile
{
    public static void main()
    {
        automorphicTypesInWhile obj = new automorphicTypesInWhile();
        obj.automorphic1();
    }
    void automorphic1()
    {
        Scanner sc = new Scanner(System.in);
        int i, d, a, c = 0;
        System.out.println("Enter an integer: ");
        a = sc.nextInt();
        i = a;
        while (i > 0)
        {
            c++;
            i /= 10;
        }
        /*
        for(i = a; i > 0; i /= 10)
        {
            c++;
        }*/
        if ((Math.pow(a, 2)) % (int)Math.pow(10, c) == a)
            System.out.println("Automorphic Number");
        else if ((Math.pow(a, 3)) % (int)Math.pow(10, c) == a)
            System.out.println("Trimorphic Number");
        else if ((3 * a * a) % (int)Math.pow(10, c) == a)
            System.out.println("Tri-Automorphic Number");
        else
            System.out.println("Not any type of Automorphic Number");
    }
}