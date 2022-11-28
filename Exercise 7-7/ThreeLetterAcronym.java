import java.util.*;
public class ThreeLetterAcronym {
    public static void main(String[] args) {
        String[] fullName = new String[3];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a three word phrase:");
        for(int i=0;i<3;i++)
            {
                fullName[i]=sc.next();
            }
        System.out.println("The acronym for this is: ");
        for(int i=0;i<3;i++)
            {
                String s=Character.toString(fullName[i].charAt(0));
                String x=s.toUpperCase();
                System.out.print(x);
    }
}

}
