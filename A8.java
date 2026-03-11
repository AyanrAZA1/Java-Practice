// Using Scanner to take input from user

import java.util.Scanner;

class A8 {
    public static void main(String aa[]) {

        Scanner sc = new Scanner(System.in);  // Scanner object to read input

        System.out.print("Enter a Number: ");
        int a = sc.nextInt();  // reads first integer

        System.out.print("Enter 2nd Number: ");
        int b = sc.nextInt();  // reads second integer

        int c = a + b;  // adds the two numbers

        System.out.println("Sum=" + c);  // prints the result
    }
}
