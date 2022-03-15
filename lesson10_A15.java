class lesson10_A15
{
    public static void main(int n)
    {
        int i, c, d, j;
        for (i = 0; i <= 9; i++)
        {
            c = 0;
            for (j = n; j > 0; j /= 10)
            {
                d = j % 10;
                if(d == i)
                    c++;
            }
            if(c > 0)
                System.out.println("Frequency of "+i+": "+c);
        }
    }
}