class lesson9_20
{
    public static void i()
    {
        int i, s = 0;
        for(i = 1; i <= 9; i++)
        {
            s = s + i * (i + 1);
        }
        System.out.println("Sum: " +s);
    }
    
    public static void ii()
    {
        int i, s = 0;
        for(i = 1; i <= 9; i += 2)
        
        {
            s = s + i * (i + 1);
        }
        System.out.println("Sum: " +s);
    }
    
    public static void iii()
    {
        int i, s = 0;
        for(i = 1; i <= 9; i += 2)
        
        {
            s = s + i * (i + 2);
        }
        System.out.println("Sum: " +s);
    }
    
    public static void iv()
    {
        int i, s = 0;
        for(i = 1; i <= 20; i++)
        
        {
            if(i % 2 == 0)
                s -= i;
            else
                s += i;
        }
        System.out.println("Sum: " +s);
    }
    
    public static void v()
    {
        int i;
        float s = 0;
        for(i = 1; i <= 10; i++)
        
        {
            s = s + (float)1/i;
        }
        System.out.println("Sum: " +s);
    }
    
    public static void vi()
    {
        int i;
        float s = 0;
        for(i = 1; i <= 9; i++)
        
        {
            s = s + (float)i / (i + 1);
        }
        System.out.println("Sum: " +s);
    }
    
    public static void vii()
    {
        int i;
        float s = 0;
        for(i = 1; i <= 10; i++)
        {
            if(i == 2 || i == 10)
            s = s - (float)i / (i + 1);
            else
                s = s + (float)i / (i + 1);
        }
        System.out.println("Sum: " +s);
    }
    
    public static void main(String [] args)
    {
        lesson9_20 i =  new lesson9_20();
        i.i();
        lesson9_20 ii =  new lesson9_20();
        ii.ii();
        lesson9_20 iii =  new lesson9_20();
        iii.iii();
        lesson9_20 iv =  new lesson9_20();
        iv.iv();
        lesson9_20 v =  new lesson9_20();
        v.v();
        lesson9_20 vi =  new lesson9_20();
        vi.vi();
        lesson9_20 vii = new lesson9_20();
        vii.vii();
    }
}