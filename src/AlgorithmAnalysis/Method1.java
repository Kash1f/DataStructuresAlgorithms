package AlgorithmAnalysis;
import java.util.Scanner;


//Problem: Find sum of n natural numbers

//Method 1 to solve this Problem:
public class Method1 {
    public static void main(String[] args) {

        //Creating Scanner object to take input
        Scanner sc = new Scanner(System.in);

        //Prompt to enter a number
        System.out.println("Enter a number: ");
        int n = sc.nextInt(); //this reads user input and stores it in n variable

        int sum = 0;

        //Loop to calculate sum of n numbers
        for(int i=1; i<=n; i++){
            sum = sum + i;
        }

        //Sum Output
        System.out.println("Sum of first n natural numbers is: " + sum);
    }
}



