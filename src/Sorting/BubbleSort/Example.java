package Sorting.BubbleSort;

public class Example {
    public static void main(String[] args) {

        int array[] = { 9, 1, 8, 2, 7, 3, 6, 4, 5};
        int size = array.length;
        int temp = 0;

        System.out.println("Before Sorting");
        for (int num : array) {
            System.out.println(num + "");
        }

        for(int i=0; i<size;i++){
            for(int j=0;j<size;j++){
                if(array[j] > array[j+1]){
                    temp = array[j];
                }
            }

    }
}
