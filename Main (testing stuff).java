/*
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}
*/



import java.util.Scanner;
import java.lang.Math;

class Main {
  public static void main (String[] args) {
    Scanner scnr = new Scanner (System.in);

    int birthMonth;
    int birthYear;
    int age;

    System.out.println("Enter month: ");
    birthMonth = scnr.nextInt();
    System.out.println("Enter year: ");
    birthYear = scnr.nextInt();

    System.out.println("Enter age: ");
    age = scnr.nextInt();
    

    System.out.println(birthMonth + "/" + birthYear+ ". My age is: "+ (12 * age));

  }
}
