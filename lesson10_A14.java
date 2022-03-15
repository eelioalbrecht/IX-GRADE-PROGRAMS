class lesson10_A14
{
public static void main(int n)
{
    int i, s = 0, c = 0, d, j, d1, f = 0;
    for(i = n; i > 0; i /= 10)
    {
        d1 = i % 10;
        for(j = i / 10; j > 0;j /= 10)
        {
            d = j % 10;
            if(d == d1)
                f = 1;
        }
    }
    if(f == 0)
        System.out.println("All digits are unique");
    else
        System.out.println("All digits are not unique");
}
}