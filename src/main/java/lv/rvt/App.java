package lv.rvt;

import java.util.ArrayList;
import java.util.Comparator;

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

        public static void main (String[] args){

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(5);
        list.add(3);
        list.add(33);
        list.add(199);
        list.add(105);

        list.sort(Comparator.naturalOrder());

        list.sort(Comparator.reverseOrder());

        System.out.println("\n");
        System.out.println("=================");
        System.out.println("| index | value |");
        System.out.println("=================");
        for(int i = 0; i < list.size(); i++){
        System.out.printf("| %-5d | %-5d | \n", i, list.get(i));
        }
        System.out.println("=================");

}       
}       





















