/*Write a program to pass an integer as argument and print the largest as well
as smallest digit.*/
class lesson9_30
{
    public static void main(int a)
    {
        int i, d, l = 0, s = 0, c = 0;
        for(i = a; i > 0; i /= 10)
        {
            d = i % 10;
            c++;
            if (c == 1)
                l = s = d;
            if (d > l)
                l = d;
            if (d < s)
                s = d;
        }
        System.out.println("Largest: " +l);
        System.out.println("Smallest: " +s);
    }
}