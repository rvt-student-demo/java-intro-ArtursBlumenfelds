package lv.rvt;

import java.util.ArrayList;

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

        Person ada = new Person("Ada Lovelace ", "24 Maddox St. London W1S 2QN");
        Person esko = new Person("Esko Ukkonen ", "Mannerheimintie 15 00100 Helsinki");

        System.out.println(ada);
        System.out.println(esko);
        

        Student ollie = new Student("Ollie ", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie);
        ollie.study();
        System.out.println("Study credits "+ ollie.credits());

        Teacher adaTeacher = new Teacher("Ada Lovelace ", "24 Maddox St. London W1S 2QN", 1200);
        Teacher eskoTeacher = new Teacher("Esko Ukkonen ", "Mannerheimintie 15 00100 Helsinki", 5400);
        System.out.println(adaTeacher);
        System.out.println(eskoTeacher);

        Student ollieStudent = new Student("Ollie ", "6381 Hollywood Blvd. Los Angeles 90028");

        int i = 0;
        while (i < 25) {
        ollieStudent.study();
        i = i + 1;
        }
        System.out.println(ollieStudent);

        System.out.println("_______________________");

        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

        System.out.println(persons);
}       
}       





















