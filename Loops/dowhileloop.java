package Loops;
import java.util.Scanner;

public class dowhileloop {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to iterate the do while loop: ");
        int num = scanner.nextInt();

        int i = 0;
        do{
            System.out.println("i: "+i);
            i++;
        }while(i<=num);
    }
}
