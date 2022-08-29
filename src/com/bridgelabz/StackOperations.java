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

}
