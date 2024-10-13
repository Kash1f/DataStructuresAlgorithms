package Arrays;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {

        // Logic 1 - Using Third Variable i.e temporary or temp variable
        int a = 10, b = 20;
        System.out.println("Before Swapping Values are: " + a + "  " + b);

        // Logic No 1 - Using Third Variable i.e temporary or temp variable
        // int temp = a;
        // a = b;
        // b = temp;

        // Logic 2 use + and -

        // a = a + b; // 30
        // b = a - b; // 30 - 20 = 10
        // a = a - b; // 30 - 10 = 20

        // Logic 3 use * and /
        // here a & b values should not be Zero

        a = a * b; //10*20 = 200
        b = a / b; //200/20 = 10
        a = a / b; //200/10 = 20;


        //Logic 4 - Bitwise XOR (^)

            a = a ^ b;
            b = a ^ b;
            a = a ^ b;



        System.out.println("After Swapping Values are: " + a + "  " + b);

    }
}
