class lesson10_A8
{
    public static void main(String [] args)
    {
        int i, j, c;
        for (i = 1; i <= 100; i++)
        {
            c = 0;
            for (j = 1; j < i; i++)
            {
                if(i % j == 0)
                    c += j;
            }
            if(c == i)
                System.out.println(i);
        }
    }
}