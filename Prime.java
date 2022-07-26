import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number and check it is prime or not:");
        int number = sc.nextInt();
        boolean flag = false;


        for (int i = 2; i <= number / 2; i++) {

            if (number % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(number + " is a prime number.");
        else
            System.out.println(number + " is not a prime number.");
    }
}