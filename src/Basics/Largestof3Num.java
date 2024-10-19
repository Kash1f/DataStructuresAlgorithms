package Basics;

import java.util.Scanner;

public class Largestof3Num {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first Number: ");
        int a = sc.nextInt();

        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();

        System.out.println("Enter Third Number: ");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println(a + " is largest number");
        } else if (b > a && b > c) {
            System.out.println(b + " is largst number");
        } else {
            System.out.println(c + " is largest number");
        }

    }
}


//Logic of the program;

/*

Input 3 numbers
Run if else condition starting from a and b like this
a>b and a>c --> a is largest
b>a and b>c --> b is largest
if not both then c is largest


 */
