import java.util.Scanner;


public class Calculator
{
    public static void main (String[] args){


        Scanner s = new  Scanner(System.in);

        System.out.println("Enter the value of first number");
        int num1 = s.nextInt();

        System.out.println("Enter the value of second number");
        int num2 = s.nextInt();

        int sum = num1 + num2 ;
        int sub = num1 - num2;
        int mul = num1 * num2;

        float Div ;
        if(num1>= num2 && num2 !=0 ){
            Div =  num1/num2;
            System.out.println("The Division of above number is" + Div);
        }
        else{
            System.out.println("The division is not possible");
        }


        

        s.close();
        
        // int a = 2;
       // int b = 3;
        
       // int sum = a + b ;

       // System.out.println("The sum of two numbers is " + sum);
    }
}