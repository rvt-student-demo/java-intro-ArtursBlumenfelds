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
        
        Scanner  scanneer = new Scanner(System.in);

        System.out.println("Give the first number:");
        
        int firstinteger = Integer.valueOf(scanneer.nextLine());
        
        
        System.out.println("Give the second number:");
        
        Scanner  scanner = new Scanner(System.in);

        int secondinteger = Integer.valueOf(scanner.nextLine());

        String valueFirst = String.valueOf(firstinteger);
        String valueSecond = String.valueOf(secondinteger);

        int sum = firstinteger + secondinteger;
        int minus = firstinteger - secondinteger;
        int dev = firstinteger / secondinteger;
        int mult = firstinteger * secondinteger;

        System.out.println(firstinteger+ " + "+secondinteger+" = "+sum);
        System.out.println(firstinteger+ " - "+secondinteger+" = "+minus);
        System.out.println(firstinteger+ " / "+secondinteger+" = "+dev);
        System.out.println(firstinteger+ " * "+secondinteger+" = "+mult);
    }

}
