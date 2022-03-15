class lesson9_4
{
    public static void main(String [] args)
    {
        int i, s = 0;
        for(i = 101; i <= 999; i+=2)
        {
            if(i % 5 == 0)
                s = s + i;
        }
        System.out.println(s);
    }
}