package lv.rvt;

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
    
    public class Main {

        public static void main(String[] args) {
            HealthStation childrensHospital = new HealthStation();
        
            Person ethan = new Person("Ethan", 1, 110, 7);
            Person peter = new Person("Peter", 33, 176, 85);
        
            System.out.println("weighings performed: " + childrensHospital.weighings());
        
            childrensHospital.weigh(ethan);
            childrensHospital.weigh(peter);
        
            System.out.println("weighings performed: " + childrensHospital.weighings());
        
            childrensHospital.weigh(ethan);
            childrensHospital.weigh(ethan);
            childrensHospital.weigh(ethan);
            childrensHospital.weigh(ethan);
        
            System.out.println("weighings performed: " + childrensHospital.weighings());
        
        }
    }
}


























