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
        
        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("");
        printSquare(4);
        printRectangle(17, 3);
        printTriangle(4);}

        public static void printStars(int number) {
            for(int i = 0; i < number; i++) {
                  System.out.print("*");
                  
            }
          System.out.println("");
        }
        public static void printSquare(int size) {
            for(int i = 0; i < size; i++) {
                  printStars(size);
                  
            }
          System.out.println("");
        }
        public static void printRectangle(int width, int height) {
            for(int i = 0; i < height; i++) {
                  printStars(width);
                  
            }
          System.out.println("");
        }
        public static void printTriangle(int size) {
            for(int i = 0; i <= size; i++) {
                  printStars(i);
                  
            }
          System.out.println("");
        }
    }
