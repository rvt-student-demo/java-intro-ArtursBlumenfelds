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
      
        
        int[] valA = { 13, -22,  82,  17}; 
        int[] valB = {-12,  24, -79, -13};
        int[] sum = {  0,   0,   0,   0};

        for(int i=0;i<=3;i++){
        sum[i] = valA[i] + valB[i];
    }
        System.out.println( "sum: " 
            + sum[0] + " " + sum[1] + " " + sum[2] + " " + sum[3] );
       
        
    }
}
