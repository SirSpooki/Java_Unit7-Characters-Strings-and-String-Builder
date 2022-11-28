import java.util.*;
public class CountSpaces2 {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an inspirational quote >>");
        String user = scan.nextLine();

        calculateSpaces(user);
    }

    public static int calculateSpaces(String inString)
    {
        int spaceCount = 0;
        for(int x = 0; x < inString.length(); ++x)
            {
                if(inString.charAt(x) == ' ')
                    {
                        ++spaceCount;
                    }
            }
        System.out.println("Amount of Spaces is "+spaceCount);
        return spaceCount;
    }
}
