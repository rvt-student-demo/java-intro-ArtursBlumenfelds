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
      
        int sum = 0;
        int[] val = {0, 1, 2, 3}; 
        
        for(int i =0;i<=val.length-1;i++){
            sum = sum + val[i];
        }
        
     
        System.out.println( "Sum of all numbers = " + sum );
    }
}
