import java.util.Scanner;
public class InputCharacterInfo {
    public static void main(String[] args) 
    {
        char user = AskUser();
        System.out.println("The character is "+user);

        UpperLowerTest(user);

        user = Character.toLowerCase(user);
        System.out.println("After toLowerCase(), aChar is "+user);

        user = Character.toUpperCase(user);
        System.out.println("After toUpperCase(), aChar is "+user);

        letterDigitWhite(user);


        
    }

    public static char AskUser()
        {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter a Character...   ");
            char user = scan.nextLine().charAt(0);
            return user;
        }
    public static void UpperLowerTest(char user)
        {
            if(Character.isUpperCase(user))
                {
                    System.out.println(user + " is uppercase");
                }
            else
                {
                    System.out.println(user + " is not uppercase");
                }

            if(Character.isLowerCase(user))
                {
                    System.out.println(user + " is lowercase");
                }
            else
                {
                    System.out.println(user + " is not lowercase");
                }
        }
    public static void letterDigitWhite(char user)
        {
            if(Character.isLetterOrDigit(user))
                {
                    System.out.println(user+" is a letter or digit");
                }
            else
                {
                    System.out.println(user+" is neither a letter nor a digit");
                }
            if(Character.isWhitespace(user))
                {
                    System.out.println(user+" is whitespace");
                }
            else
                {
                    System.out.println(user+" is not whitespace");
                }
        }
}
