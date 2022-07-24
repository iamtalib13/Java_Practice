import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          System.out.println("Enter the first number :");
           int number1 = sc.nextInt();
            System.out.println("Enter the second number");
            int number2 = sc.nextInt();
            System.out.println("Addition of two numbers : " + (number1+number2));
            System.out.println("Subtraction of two numbers : " + (number1-number2));
            System.out.println("Multiplication of two numbers : " + (number1*number2));
        System.out.println("Division of two numbers : " + (number1/number2));
    }
}
