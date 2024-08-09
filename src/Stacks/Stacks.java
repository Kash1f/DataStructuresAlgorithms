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
        System.out.println(stack);

    }
}
