// If-else if in Java (to find largest number)

import java.util.Scanner;

class A11 {
    public static void main(String aa[]) {

        Scanner sc = new Scanner(System.in); // used to take input

        System.out.print("Enter 3 Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c) {        // check if a is largest
            System.out.println("A is Largest");
        }
        else if (b > c) {            // check if b is largest
            System.out.println("B is Largest");
        }
        else {
            System.out.println("C is Largest"); // otherwise c is largest
        }

    }
}
