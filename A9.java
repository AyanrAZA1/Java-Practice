// If statement in Java

import java.util.Scanner;

class A9 {
    public static void main(String aa[]) {

        Scanner sc = new Scanner(System.in); // used to take input

        System.out.print("Enter a Number: ");
        int a = sc.nextInt(); // reads integer input

        if (a % 2 == 0) {  // checks if number is divisible by 2
            System.out.println("Even");
        } 
        else {
            System.out.println("Odd");
        }

    }
}
