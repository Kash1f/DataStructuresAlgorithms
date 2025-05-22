package JavaCollectionsFrameworks;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack <Integer> stack = new Stack<>();
        stack.push(15);
        stack.push(15);
        stack.push(35);
        System.out.println(stack.peek());
        System.out.println(stack);
    }
}

/* 

Imp points:
1. Stack follows the last in first out principle - LIFO
2. stack can have duplicate elements
3. Stack extends Vector because vector is thread safe, multi threading can be a problem in stack

*/