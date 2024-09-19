package LinearSearch;

public class Basic {
    public static void main(String[] args) {
        


        int a[] = {10, 20, 30, 50, 40};

        int element_toSearch = 50;

        for(int i = 0; i<a.length; i++){
            if(element_toSearch == a[i]){
                System.out.println(i);
            }
        }

    }
}
