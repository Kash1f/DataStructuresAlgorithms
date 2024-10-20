package Arrays;

public class SumExample {
    public static void main(String[] args) {
        int a[] = { 5, 2, 7, 8, 4 };

        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i]; // 5+2+7+8+4
        }
        System.out.println(sum);
    }



    // public static int findSum(int n){
    //     int sum = 0;
    //     for(int i = 1; i <= n; i++){
    //         sum = sum + i;
    //     }
    //     return sum;
    // }

    // public static void main(String[] args) {
    //     int n = 5;

    //     int result = findSum(n);
    //     System.out.println("The sum is: " + result);
    // }


}


