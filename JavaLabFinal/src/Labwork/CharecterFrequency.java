package Labwork;

import java.util.Arrays;
import java.util.Scanner;

public class CharecterFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        char[] str = sc.nextLine().toCharArray();
        Arrays.sort(str);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        int f = 0;
        for (char c : str) {
            if (c > ch) {
                break;
            } else if (c == ch) {
                f++;
            }
        }
        System.out.println("Frequency of \'" + ch + "\' in string is " + f);
    }
}
