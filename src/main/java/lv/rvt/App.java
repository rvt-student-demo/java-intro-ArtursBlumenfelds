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
      
        int[] val = {13, -4, 82, 17}; 
        int[] twice = new int [4];
        
        System.out.println( "Original Array: " 
            + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
      
        for(int i=0;i<=val.length-1;i++){
            twice[i] = val[i] * 2;
        }
        System.out.println( "New Array: " 
            + twice[0] + " " + twice[1] + " " + twice[2] + " " + twice[3] );
       
    }
}
