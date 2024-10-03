package Arrays;

public class SumofElements {
    public static void main(String[] args) {
        int a[] ={5, 2, 7, 8, 4};

        int sum = 0;

        for(int i = 0; i < a.length; i++){
            sum = sum + a[i]; // 5+2+7+8+4
        }
        System.out.println(sum);
    }
}
