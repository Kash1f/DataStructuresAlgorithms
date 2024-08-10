//Stack Data Structure works on the LIFO(Last-In First-Out) method. The object that enters at last will be removed first


package Stacks;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {

        // We first need to declare our stack and instantiate it
        // it will have the data type of the objects that we will be adding to our stack

        // Here we will create a Stack that store names of video games

        Stack<String> stack = new Stack<String>();

        stack.push("CS2");
        stack.push("Call of duty");
        stack.push("Battlefield");
        stack.push("RDR2");
        stack.push("Medal of Honor");
       
        
        // String myFavGame = stack.pop();
        // System.out.println(stack.peek());

        System.out.println(stack.search("CS2"));
       

    }
}
