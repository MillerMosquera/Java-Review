package DataStructure;

import java.util.Stack;

public class Stack_pilas {
    public static void main(String[] args) {
        //Stack o pilas - último en entrar, primero en salir

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.empty());

    }
}
