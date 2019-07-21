package Labwork;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        System.out.println("Reverse string is: " + reverse(sc.nextLine()));
    }

    static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
