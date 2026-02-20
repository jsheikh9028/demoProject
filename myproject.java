import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number please: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number please: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum is: " + sum);

    System.out.println("Sum is: " + sum);
    	scanner.close();
    }
}

