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
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times?");
        int integer = Integer.valueOf(scanner.nextLine());
        int time = 0;
        while (time < integer){
            print();
            time = time + 1;
        }
       
    }
    public static void print()
    {    
        System.out.println("In a hole in the ground there lived a method"); 
    }

}   