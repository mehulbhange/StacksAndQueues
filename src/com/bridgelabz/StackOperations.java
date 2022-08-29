package com.bridgelabz;

public class StackOperations {

    private LinkedList linkedList;

    public StackOperations(){
        linkedList = new LinkedList();
    }

    //Method used to push the element in the stack
    public void push(int data){
        linkedList.addNode(data);
    }

    //Method used to show the stack elements
    public void show(){
        linkedList.displayList();
    }

    /*
    * This method will return true if top is null
    * */
    public boolean isEmpty(){
        return linkedList.isEmpty();
    }

    /*
    * This method will return top element without removing it if stack is not empty
    * else it will show stack is empty and return -1
    * */
    public int peek(){
        if (isEmpty()){
            System.out.println("Stack is empty!");
            return -1;
        }
        return linkedList.top.data;
    }
    /*
     * This method will return top element and remove it, if stack is not empty
     * else it will show stack is empty and return -1
     * */
    public int pop(){
        if (isEmpty()){
            System.out.println("Stack is empty!");
            return -1;
        }
        return linkedList.remove();
    }

}
