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
        
        Scanner scaneer = new Scanner(System.in);
        System.out.println("Give numbers:");
        int sum = 0;
        int hm = 0;
        float avg = 0;
        int odd = 0;
        int even = 0;
        while (true) {
            int num = Integer.valueOf(scaneer.nextLine());
            if(num == -1){
                break;
            }
            sum = num + sum;
            hm = hm + 1;
            avg = sum / hm;
            if(num % 2 == 0){
                even = even + 1;
            }
            else{
                odd = odd + 1;
            }
        }
        System.out.println("Thx!Bye!");
        System.out.println("Sum:" + sum);
        System.out.println("Numbers:" + hm);
        System.out.println("Average:" + avg);
        System.out.println("Even:" + even);
        System.out.println("Odd:" + odd);
    }
}   