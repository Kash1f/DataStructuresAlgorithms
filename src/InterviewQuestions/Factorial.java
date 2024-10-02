package InterviewQuestions;

public class Factorial {
    public static void main(String[] args) {
        
        //Ascending Order
        int num = 5;

        long factorial = 1;

        for(int i = 1; i <= num; i++){
            factorial = factorial * i;
        }

        System.out.println("Factorial from method 1 is: " + factorial);


        //Descending number
        int num2 = 5;

        long factorial2 = 1;

        for(int i = num2; i >= 1; i--){
            factorial2 = factorial2 * i;
        }
        System.out.println("Factorial from method 2 is: " + factorial2);
    }
}
 