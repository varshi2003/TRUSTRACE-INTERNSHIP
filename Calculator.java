import java.util.*;

public class Calculator {
    public static int Add(int num1, int num2) {
        return num1 + num2;
    }

    public static int Sub(int num1, int num2) {
        return num1 - num2;
    }

    public static int Mul(int num1, int num2) {
        return num1 * num2;
    }

    public static int Div(int num1, int num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("Welcome to Calculator");
            System.out.println("Enter two numbers to perform the required operation:");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println("Enter the choice\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    int add_res = Add(num1, num2);
                    System.out.println("The sum of " + num1 + " and " + num2 + " is " + add_res);
                    break;

                case 2:
                    int sub_res = Sub(num1, num2);
                    System.out.println("The difference between " + num1 + " and " + num2 + " is " + sub_res);
                    break;

                case 3:
                    int mul_res = Mul(num1, num2);
                    System.out.println("The product of " + num1 + " and " + num2 + " is " + mul_res);
                    break;

                case 4:
                    if (num2 != 0) {
                        int div_res = Div(num1, num2);
                        System.out.println("The division of " + num1 + " by " + num2 + " is " + div_res);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;

                case 5:
                    exit = true;
                    System.out.println("Exiting the calculator.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();  // Add a blank line for better readability
        }


    }
}
