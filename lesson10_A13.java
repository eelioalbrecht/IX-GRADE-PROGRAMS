class lesson10_A13
{
    public static void main(int n)
    {
        int i, s = 0, c = 0, d, j;
        for(i = 9; i >= 0; i--)
        {
            for(j = n; j > 0; j /= 10)
            {
                d = j % 10;
                if(d == i)
                    s += d * (int) Math.pow(10, c++);
            }
        }
        System.out.println("New number: " +s);
    }
}