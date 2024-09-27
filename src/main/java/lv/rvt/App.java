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

        
        
        System.out.println("Give the points[0-100]:");
        int points = Integer.valueOf(scanneer.nextLine());
        if (points < 0)
        {
            System.out.println("Impossible!");
        }
        if (points > 0 && points <= 49){
            System.out.println("failed");
        }
        if (points >= 50 && points <= 59){
            System.out.println("1");
        }
        if (points >= 60 && points <= 69){
            System.out.println("2");
        }
        if (points >= 70 && points <= 79){
            System.out.println("3");
        }
        if (points >= 80 && points <= 89){
            System.out.println("4");
        }
        if (points >= 90 && points <= 100){
            System.out.println("5");
        }
        if (points > 100){
            System.out.println("incredible!");
        }
        
        


    }

}
