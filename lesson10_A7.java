class lesson10_A7
{
    public static void main(String []args)
    {
        int i, j, c;
        for (i = 10; i <= 99; i++)
        {
            c = 0;
            for (j = 1; j <= i; j++)
            {
                if(i % j == 0)
                    c++;
            }
            if(c == 2)
                System.out.println(i);
        }
    }
}