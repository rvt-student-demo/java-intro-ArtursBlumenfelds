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

        public static void main (String[] args){
                Book book1 = new Book("Fyodor Dostoevsky", "Crime and Punishment", 2);
                Book book2 = new Book("Robert Martin", "Clean Code", 1);
                Book book3 = new Book("Kent Beck", "Test Driven Development", 0.5);
            
                CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
                CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
                CD cd3 = new CD("Rendezvous Park", "Closer to Being Here", 2012);
            
                System.out.println(book1);
                System.out.println(book2);
                System.out.println(book3);
                System.out.println(cd1);
                System.out.println(cd2);
                System.out.println(cd3);


}       
}       





















