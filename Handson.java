import java.util.Scanner;

public class Handson {
    public static void main ( String[] args){
    
    int number =10;
    float f = 3.14f; // we have to give f after the value to define it as a flioat in Java 

    //In Java, System.out.printf() is used for formatted output to the console.
    // It allows you to construct a string with placeholders and then fill those placeholders with actual values.

    System.out.printf("\nThis is the  value of x: %d\n", number);//----> This is to print the  Value of an integer ...
    System.out.printf("The value of Pi is %.2f\n", f); //------> This is to print the value of a float 

    String name = "Alice";  // This is to print the Multiple Values 
    int age = 30;
    System.out.printf("%s is %d years old.\n", name, age);


    /*Scanner s = new Scanner(System.in);
    System.out.println("Enter the Value of Your age:");
    int data = s.nextInt();
    System.out.println("The value of age is" + data); */


    char[] charstring = { 's','h','a','r','a','d'};
    Scanner scanner = new Scanner(System.in);
    String str = new String(charstring);

    System.out.println("The value of Str is :" + str);
  }
}