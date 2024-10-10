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

        int numinp = -1;
        int summ = 0;

        while(true) 
        {
           
            System.out.println("Give a number: ");
            int integer = Integer.valueOf(scanneer.nextLine());
            numinp = numinp + 1;
            summ = summ + integer;
            if(integer == 0){
                break;
            }
        }

        System.out.println("Number of numbers:" + numinp);
        System.out.println("Sum of numbers:" + summ);

    }
}

