
package yalungcarlos;

import java.util.Scanner;

public class YalungCarlos3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = scanner.nextInt();
        checkPosNeg(num1);

        System.out.print("\nEnter a number: ");
        int num2 = scanner.nextInt();
        checkPosNeg(num2);

        System.out.print("\nEnter a number: ");
        int num3 = scanner.nextInt();
        checkPosNeg(num3);

        scanner.close();
    }

    public static void checkPosNeg(int num) {
        if (num > 0) {
            System.out.println("\n" + num + " is a positive number");
        } else if (num < 0) {
            System.out.println("\n" + num + " is a negative number");
        } else {
            System.out.println("\nInputted number Zero");
        }
    }
}
