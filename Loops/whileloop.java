package Loops;
import java.util.Scanner;

public class whileloop {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to iterate the while loop: ");
        int num = scanner.nextInt();
        int i = 0;
        while(i<=num){
            System.out.println("i: "+ i);
            i++;
        }
        
    }
}
