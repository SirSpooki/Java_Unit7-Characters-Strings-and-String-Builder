public class CountSpaces
{
    public static void main(String[] args)
    {
       calculateSpaces("Nuts Hangin', Guns Slangin'"); 
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
