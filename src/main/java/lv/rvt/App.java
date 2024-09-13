package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Hello RVT!");
        System.out.println("... and the universe!");
        //sout = print
        String name = "Artūrs";
        int age = 20;
        boolean isOnline = false;
        
        System.out.println(name);
        System.out.println(age);
        System.out.println(isOnline);

        // Scanner  scanneer = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Jūsu vards: ");
        System.out.println("___");
        String name1 = scanner.nextLine(); //returns to ievadi

        System.out.println("Jūsu Uzvārds: ");
        System.out.println("___");
        String surname = scanner.nextLine();

        System.out.println("Jūsu grupa: ");
        System.out.println("___");
        String group = scanner.nextLine();

        System.out.println("Students: " + name1 + " " + surname + ", grupa: " + group);



    }
}
