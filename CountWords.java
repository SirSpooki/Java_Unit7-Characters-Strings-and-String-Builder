import java.util.*;
public class CountWords {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String >>");
        String user = scan.nextLine();

        user = user.replace('.',' ');
        user = user.replace(',',' ');
        user = user.replace(';',' ');
        user = user.replace('?',' ');
        user = user.replace('!',' ');
        user = user.replace('-',' ');

         user = user.trim().replaceAll(" +", " ");

        int words = user.split(" ").length;
        System.out.println("Number of words = "+words);
    }
}
