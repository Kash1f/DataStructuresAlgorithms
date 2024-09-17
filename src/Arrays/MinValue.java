package Arrays;
import java.util.Arrays;

public class MinValue {
    public static void main(String[] args) {
        int a[] = {50,30,20,40,60};

        int max = a[0];
        for(int i = 1; i < a.length; i++){
            if(a[i] > max){
                a[i] = max;
            }
        }
    }
}
