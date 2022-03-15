/*A game of dice is to be simulated for two players, each player gets a chance 
to throw his dice, and the value is added to his points, this process continues 
alternately until for the player whose added points equals to 20 and is 
declared the winner. Write a program to simulate this process using the 
random( ) function.*/
class lesson9_46
{
    public static void main(String [] args)
    {
        int i, r1, r2, s1 = 0, s2 = 0;
        for(i = 1; s1 < 20 && s2 < 20; i++)
        {
            r1 = 1 + (int)(Math.random()*20);
            s1 += r1;
            if (s1 < 20)
            {
                r2 = 1 + (int)(Math.random()*20);
                s2 += r2;
            }
        }
        if (s1 > s2)
            System.out.println("Winnter is player 1");
        else
            System.out.println("Winner is player 2");
    }
}