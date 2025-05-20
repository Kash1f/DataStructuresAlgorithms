package JavaCollectionsFrameworks;

import java.util.ArrayList;
// import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(3, 6);

        System.out.println(list);

    }
}

// interface ka kabhi object nahi banta