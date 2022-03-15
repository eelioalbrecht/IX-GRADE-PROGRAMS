/*Write a program to print the first 15 numbers of the Pell series. 
Pell series is such a series which starts from 1 and 2 , and subsequent numbers
is the sum of twice the previous number and the number previous to the previous 
number. Pell series: 1, 2, 5, 12, 29, 70, 169, 408, 985, 2378, 5741, 13860, …*/
class lesson9_23
{
    public static void main(String [] args)
    {
        int i, f = 1, s = 0, t;
        for(i = 1; i <= 15; i++)
        {
            t = f + s * 2;
            System.out.println(t);
            f = s;
            s = t;
        }
    }
}