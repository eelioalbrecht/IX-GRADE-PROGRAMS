/*Write a program to pass an integer as argument and find the sum of its digits.*/
class lesson9_27
{
    public static void main(int a)
    {
        int i, d, s = 0;
        for(i = a; i > 0; i /= 10)
        {
            d = i % 10;
            s += d;
        }
        System.out.println("Sum: " +s);
    }
}
