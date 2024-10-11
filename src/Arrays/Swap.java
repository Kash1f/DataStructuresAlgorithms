package Arrays;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {

        //Logic No 1 - Using Third Variable i.e temporary or temp variable
        int a = 10, b = 20;
        System.out.println("Before Swapping Values are: " + a + "  " + b);

        //Logic No 1 - Using Third Variable i.e temporary or temp variable
        int temp = a;
        a = b;
        b = temp;

        //Logic 2 - se + and -

        a = a + b; // 30 
        b = a - b; 
        a = a - b;

        System.out.println("Before Swapping Values are: " + a + "  " + b);

    }
}
