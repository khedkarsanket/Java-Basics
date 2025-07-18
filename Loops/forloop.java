package Loops;

import java.util.Scanner;

public class forloop {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        // Accept the input from the user
        System.out.println("Enter the number for loop iteration");
        int num = scanner.nextInt();

        for(int i=0; i<=num; i++){
            System.out.println("i: "+ i);
        }
        scanner.close();
    }
    
}
