package com.bridgelabz;

public class LinkedList {
    //Used to hold the head value of linked list
    Node top;

    /*
    *This method is used to add the node at begining of the linked list
    *  */
    public void addNode(int data){
        Node newNode = new Node(data);
        if (top == null){
            top = newNode;
        }else{
            Node temp = top;
            top = newNode;
            newNode.next = temp;
        }
    }
    //This method used to display the linked list
    public void displayList(){
        if (top == null)
            System.out.println("List is empty");
        else{
            Node current = top;
            while (current != null){
                System.out.print(current.data+" -> ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public boolean isEmpty(){
        if ( top == null)
            return true;
        else
            return false;
    }

    //This method used to remove element from list
    public int remove(){
        int data = top.data;
        top = top.next;
        return  data;
    }
}
