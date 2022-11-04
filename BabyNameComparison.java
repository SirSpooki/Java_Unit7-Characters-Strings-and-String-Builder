import java.util.*;
public class BabyNameComparison {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a name >> ");
        String name1 = scan.nextLine();
        System.out.print("Enter a second name >> ");
        String name2 = scan.nextLine();
        System.out.print("Enter a third name >> ");
        String name3 = scan.nextLine();

        System.out.println("The combinations are:");
        System.out.println(name1+" "+name2);
        System.out.println(name1+" "+name3);
        System.out.println(name2+" "+name1);
        System.out.println(name2+" "+name3);
        System.out.println(name3+" "+name1);
        System.out.println(name3+" "+name2);

    }
}
