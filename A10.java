// For Loop in Java

import java.util.Scanner;

class A10 {
    public static void main(String aa[]) {

        Scanner sc = new Scanner(System.in); // used to take input

        System.out.print("Enter a Number: ");
        int a = sc.nextInt(); // reads the number

        for (int i = 1; i <= 10; i++) { // loop runs from 1 to 10
            int b = a * i;              // multiply number with i
            System.out.println(a + " X " + i + " = " + b); // prints table
        }

    }
}
