package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        //  System.out.println("Hello RVT!");
        //  sout = print
        //  String name = "Artūrs";
        //  int age = 20;
        //  boolean isOnline = false;
        //  Scanner  scanneer = new Scanner(System.in);
        //  String name1 = scanner.nextLine(); returns to ievadi
        //  Scanner scanner = new Scanner(System.in);
        //  String text = scanner.nextLine();
        //  int integer = Integer.valueOf(scanner.nextLine());
        //  double floatingPoint = Double.valueOf(scanner.nextLine());
        //  boolean trueOrFalse = Boolean.valueOf(scanner.nextLine());
        
        Scanner scanneer = new Scanner(System.in);

        
        
        System.out.println("Give the speed:");
        int speed = Integer.valueOf(scanneer.nextLine());
        if (speed > 120)
        {
            System.out.println("Speeding ticket!");
        }
        else {
            System.out.println("Your good to go!");
        }

        


    }

}
