package JavaCollectionsFrameworks;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(2, 25);
        list.remove(1);

        System.out.println(list);
    }
}
