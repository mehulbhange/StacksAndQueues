package com.bridgelabz;

public class QueueOperations {

    private LinkedList linkedList;

    public QueueOperations(){
        linkedList = new LinkedList();
    }
    /*
    * This method is used to add the data at rear in queue
    * */
    public void enQueue(int data){
        linkedList.addNodeAtEnd(data);
    }

    //It displays the queue
    public void show(){
        linkedList.displayList();
    }
    /*
     * This method is used to remove the data at front in queue
     * */
    public int deQueue(){
        if (linkedList.isEmpty()){
            System.out.println("Queue is empty!");
            return -1;
        }else{
            return linkedList.remove();
        }
    }

}
