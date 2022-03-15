/*Write a program to pass an integer as argument and find the sum of odd digits
and even digits separately*/
class lesson9_28
{
    public static void main(int a)
    {
        int i, d, se = 0, so = 0;
        for(i = a; i > 0; i /= 10)
        {
            d = i % 10;
            if (d % 2 == 0)
                se += d;
            else
                so += d;
        }
        System.out.println("Sum of even digits: " +se);
        System.out.println("Sum of odd digits: " +so);
    }
}