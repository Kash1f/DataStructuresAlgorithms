package Basics;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char v = sc.next().charAt(0);

        if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u') {
            System.out.println("Vowel");
        } else {
            System.out.println("Not Vowel");
        }
    }
}
