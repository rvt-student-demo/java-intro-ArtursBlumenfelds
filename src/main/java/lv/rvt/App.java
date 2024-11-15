package lv.rvt;

import java.util.Scanner;

public class App {

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
    
    public static void main(String[] args) {
        
        Scanner scanneer = new Scanner(System.in);
        
        Statistics statistics = new Statistics();
        Statistics evens = new Statistics();
        Statistics odds = new Statistics();

        System.out.println("Enter numbers:");

        while (true) {
            int num = scanneer.nextInt();

            if (num == -1) {
                break;
            }
            statistics.addNumber(num);

            if (num % 2 == 0) {
                evens.addNumber(num);
            } else {
                odds.addNumber(num);
            }

        }

        System.out.println(statistics.average());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + evens.sum());
        System.out.println("Sum of odd numbers: " + odds.sum());
    }
}



























