package com.bridgelabz;

public class QueueOperations {

    private LinkedList linkedList;

    public QueueOperations(){
        linkedList = new LinkedList();
    }
    /*
    * This method is used to add the data at front in queue
    * */
    public void enQueue(int data){
        linkedList.addNodeAtEnd(data);
    }

    //It displays the queue
    public void show(){
        linkedList.displayList();
    }

}
