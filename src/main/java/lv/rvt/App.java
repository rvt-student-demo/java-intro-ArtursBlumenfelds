package lv.rvt;x

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

public static void main (String[] args)
  {
     Box box = new  Box( 2.5, 5.0, 6.0 );

     Box box1 = new Box(2.5, 5.0, 6.0);
     Box box2 = new Box(3.0, 6.0, 7.0);



     Box biggerBox = box.biggerBox(box);

     Box smallerBox = box.smallerBox(box);

     System.out.println("Area: "  + box.area() + " volume: " + box.volume());

     System.out.println("topArea: " + box.topArea());

     System.out.println("Bigger Box Area: " + biggerBox.area() + " Volume: " + biggerBox.volume());

     System.out.println("Smaller Box Area: " + smallerBox.area() + " Volume: " + smallerBox.volume());

     System.out.println("Can box1 nests inside box2? " + box1.nests(box2));
  }
}




















