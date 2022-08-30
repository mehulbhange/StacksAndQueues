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

        System.out.println("Queue operations ");

        QueueOperations queueOperations = new QueueOperations();
        queueOperations.enQueue(56);
        queueOperations.enQueue(30);
        queueOperations.enQueue(70);
        queueOperations.show();
        System.out.println("Dequeue : " + queueOperations.deQueue());
        System.out.println("Dequeue : " + queueOperations.deQueue());
        queueOperations.show();

    }
}
