package Patterns;


//Write a Program to print below pattern
/*

12345
12345
12345
12345
12345

 */


public class Pattern1 {
    public static void main(String[] args) {
        
        for(int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
