/*1/(1+2) + 2/(2+3) + 2/(3+4) +4/(4+5) + 5/(5+6)*/
/*class ws1_7ii
{
    public static void main(String [] args)
    {
        //double sum = 1 / (1 + 2) + 2 / (2 + 3) + 3 / (3 + 4) + 4 / (4 + 5) + 5 / (5 + 6);
        //System.out.println(sum);
        int i, a = 1, b = 2, c = 3;
        for (i = 1; i > 0;)
        {
            double sum = a / (a + b);
            a += 1;
            b += 1;
            System.out.println(sum);
        }
    }
}*/
import java.util.*;
class ws1_7ii
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = 1, i, b = 2 ;
        float s = 0;
        for(i = 1; i >= 0; i++, a++, b++)
        {
            s = a/(a+b);
        }
        System.out.println("Sum: " +s);
    }
}