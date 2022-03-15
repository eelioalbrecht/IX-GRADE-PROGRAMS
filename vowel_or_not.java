import java.util.*;
class vowel_or_not
{
    public static void main(String [] args)
    {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter any alphabet: ");
        char ch = a.next().charAt(0);
        
        switch(ch)
        {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.println("Vowel");
            break;
            default:
                System.out.println("Consonant");
        }
    }
}