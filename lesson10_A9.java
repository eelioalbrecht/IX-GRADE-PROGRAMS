class lesson10_A9
{
    public static void main()
    {
        int i, j, r, d;
        for(i = 100; i <= 999; i++)
        {
            r = 0;
            for (j = i; j > 0; j /= 10)
            {
                d = j % 10;
                r = r * 10 + d;
            }
            if(r == i)
                System.out.println(i);
        }
    }
}