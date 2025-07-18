import java.util.Scanner;

public class operations {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        //Accept firat number 
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();

        //Accept second number
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Addition
        int sum = num1 + num2;
        System.out.println("Additon of " + num1 + " and " + num2 + " is : " + sum);

        // Subtraction
        int diff = num1 - num2;
        System.out.println("Difference of " + num1 + " and " + num2 + " is : " + diff);

        // Multiplication
        int mul = num1 * num2;
        System.out.println("Multiplication of " + num1 + " and " + num2 + " is : " + mul);

        // Division
        int div = num1 - num2;
        System.out.println("Division of " + num1 + " and " + num2 + " is : " + div);

        // Modulus
        int mod = num1 - num2;
        System.out.println("Modulus of " + num1 + " and " + num2 + " is : " + mod);

    }
}