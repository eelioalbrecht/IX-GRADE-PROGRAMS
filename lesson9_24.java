/*Write a program to find the sum of 1st 10 numbers of Lucas series i.e. 
2,1,3,4,7,11,18,…. Lucas series is such a series which starting from 2 and 1,
and subsequent numbers are the sum of the previous two numbers.*/
class lesson9_24
{
    public static void main(String [] args)
    {
        int i, f = 1, s = 0, t, sum = 0;
        sum = f + s;
        for(i = 1; i <= 8; i++)
        {
            t = f + s;
            sum += t;
            f = s;
            s = t;
        }
        System.out.println("Sum: " +sum);
    }
}