
package yalungcarlos;

import java.util.Scanner;

public class Yalungcarlos2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num1 = scanner.nextInt();
        checkEvenOdd(num1);

        System.out.print("\nEnter a number: ");
        int num2 = scanner.nextInt();
        checkEvenOdd(num2);

        System.out.print("\nEnter a number: ");
        int num3 = scanner.nextInt();
        checkEvenOdd(num3);

        scanner.close();
    }

    public static void checkEvenOdd(int num) {
        if (num == 0) {
            System.out.println("\nInputted number Zero");
        } else if (num % 2 == 0) {
            System.out.println("\nInputted number is even");
        } else {
            System.out.println("\nInputted number is odd");
        }
    }
}
