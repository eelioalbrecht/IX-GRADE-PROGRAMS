class lesson9_3
{
    public static void main(String [] args)
    {
        int i, s = 0;
        for(i = 100; i <= 998; i+=2)
        {
            s = s + i;
        }
        System.out.println(s);
    }
}