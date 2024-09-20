package LinearSearch;

public class Basic {
    public static void main(String[] args) {

        int a[] = { 10, 20, 30, 40 };
        boolean flag = false;

        int element_toSearch = 50;

        for (int i = 0; i < a.length; i++) {
            if (element_toSearch == a[i]) {
                System.out.println("Element found at index: " + i);
                flag = true;
                break;
            }
        }
        {

            // if the element is not found means it is not present in the array
            if (flag == false) {
                System.out.println("Element Not found");
            }
        }
    }
}
