import java.util.*;
public class Alphabetize
{
  public static void main(String[] args)
  {
    
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter first string >>  ");
    String string1 = scan.nextLine();
    System.out.print("Enter second string >>  ");
    String string2 = scan.nextLine();
    System.out.print("Enter third string >>  ");
    String string3 = scan.nextLine();

    if(string1.charAt(0) < string2.charAt(0) &&  string2.charAt(0) < string3.charAt(0))
        {
            System.out.println("You entered the strings in alphabetical order");
        }
    else
        {
            System.out.println("You did not enter the words in alphabetical order");
        }
  }
}
