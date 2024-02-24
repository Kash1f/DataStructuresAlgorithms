import java.util.Scanner;

public class arrayinput {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in)


        int[] array = new int[5];
        array[0] = 23;
        array[1] = 25;
        array[2] = 29;
        array[3] = 31;
        array[4] = 39;
        System.out.println(array[1]);


        //input using for loops

        for (int i = 0; i < 5; i++) {
            array[i] = in.nextInt();
        }



    }



}
