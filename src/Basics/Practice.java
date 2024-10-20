package Basics;

public class Practice {

    // public static int sum(int x, int y){
    // int result = x + y;

    // return result;
    // }

    // public static void main(String[] args) {
    // int result = sum(10,15);
    // System.out.println(result);
    // }

    // public static int sum(int x, int y){
    // int result = x + y;
    // return result;
    // }

    // public static void main(String[] args) {
    // int x = 10;
    // int y = 20;

    // int result = sum(x , y);
    // System.out.println(result);
    // }

    public static int sum(int x, int y) {
        int sumofXY = x + y;
        return sumofXY;
    }

    public static void main(String[] args) {
        Practice sum = new Practice();

        int x = 10;
        int y = 10;

        int result = sum.sum(x, y);

        System.out.println(result);

    }

}
