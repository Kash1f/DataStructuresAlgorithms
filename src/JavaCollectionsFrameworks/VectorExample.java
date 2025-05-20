package JavaCollectionsFrameworks;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add(15);
        vector.add(25);
        vector.add(35);
        System.out.println(vector);

        Vector<String> vector2 = new Vector<>();
        vector2.add("a");
        vector2.add("b");
        vector2.add("c");
        vector2.add("5");
        vector2.add("10");
        vector2.add("15");

        System.out.println(vector2);

    }
}

//What is the difference between Vector and ArrayList?

// 1. Thread Safety: A thread is like a mini-task running inside a program. In big or complex programs, many threads can run at the same time, this is called multi-threading. Vector is thread-safe, which means it safely handles multiple threads using it at once. It locks itself when a thread is working on it so that other threads wait, avoiding errors. On the other hand, ArrayList is not thread-safe, so if many threads try to use it at the same time, it may cause problems unless you handle it yourself.

// 2. Performance: Because Vector checks for thread safety all the time (even if only one thread is using it), it is usually slower. ArrayList doesn't check for thread safety, so it is faster, especially in simple programs that run on just one thread, which is what most beginner programs use. So, if you're not dealing with multiple threads, ArrayList is the better and faster choice.

