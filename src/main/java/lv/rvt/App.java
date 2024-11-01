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
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> date = new ArrayList<>();
        while (true) {
            System.out.println("Enter a name and birth: ");
            String nameBirth = scanneer.nextLine();
            if (nameBirth.isEmpty()){
                break;
            }
            String[] part = nameBirth.split(",");
            String name = part[0];
            int birthyear = Integer.parseInt(part[1]);
        
            names.add(name);
            date.add(birthyear);
        }
        String longname = "";
        for(String name : names){
            if(name.length() > longname.length()){
                longname = name;
            }
        }
        int sum = 0;
        for(int year : date){
            sum += year;
        }
        
        double avg = sum / (double) date.size();
        System.out.println("Longest name: " + longname);
        System.out.println("Average of the birth years: " + avg);
    }

}


























