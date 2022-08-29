package com.bridgelabz;
/**
 * Purpose - To perform stack and queue operations
 * @author - Mehul Bhange
 * @since - 29-08-2022
 */
public class StackMain {
    public static void main(String[] args) {
        System.out.println("Stacks and Queues program");

        StackOperations stackOperations = new StackOperations();
        stackOperations.push(70);
        stackOperations.push(30);
        stackOperations.push(56);

        stackOperations.show();

        System.out.println("Peek :"+stackOperations.peek());
        stackOperations.pop();
        System.out.println("Peek :"+stackOperations.peek());
        stackOperations.pop();
        System.out.println("Peek :"+stackOperations.peek());
        stackOperations.pop();

        stackOperations.pop();

    }
}
