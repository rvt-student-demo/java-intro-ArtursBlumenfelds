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

        
        
        System.out.println("Value of a gift?:");
        int gift = Integer.valueOf(scanneer.nextLine());
        if (gift < 5000)
        {
            System.out.println("No tax!");
        }
        if (gift >= 5000 && gift < 25000)
        {
            double f_tax = (100+(gift - 5000)*0.8);
            System.out.println("Tax:" + f_tax);
        }
        if (gift >= 25000 && gift < 55000)    
        {
            double s_tax = (1700+(gift - 25000)*0.10);
            System.out.println("Tax:" + s_tax);
        }
        if (gift >= 55000 && gift < 200000)    
        {
            double t_tax = (4700+(gift - 55000)*0.12);
            System.out.println("Tax:" + t_tax);
        }
        if (gift >= 200000 && gift < 1000000)    
        {
            double fo_tax = (22100+(gift - 200000)*0.15);
            System.out.println("Tax:" + fo_tax);
        }
        if (gift > 1000000)    
        {
            double fif_tax = (142100+(gift - 1000000)*0.8);
            System.out.println("Tax:" + fif_tax);
        }


    }

}
