import java.util.Scanner;

public class arithmetic_operator {
    public static void main(String [] args){
        int a,b,result;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of the numbers");
        a=scanner.nextInt();
        b=scanner.nextInt();

        result = a+b;
        System.out.println("The value of two number after addation is " + result);

        result = a-b;
        System.out.println("The value of two number after sub is" + result);

        result = a*b;
        System.out.println("The value of two number after multiplication is" + result);

       
        if (b!=0){
            result = a/b;
            System.out.println("The value of two number after Div is " + result);

        }
        else 
            System.out.println("The  Division cannot be perfomed");
        
        

    }
    
    
}
