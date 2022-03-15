/*Write a program to pass an integer as argument and find the average of its
digits.*/
class lesson9_29
{
    public static void main(int a)
    {
        int i, d, s = 0, c = 0;
        float avg;
        for(i = a; i > 0; i /=+ 10)
        {
            d = i % 10;
            s += d;
            c++;
        }
        avg = (float) s / c;
        System.out.println("Average: " +avg);
    }
}