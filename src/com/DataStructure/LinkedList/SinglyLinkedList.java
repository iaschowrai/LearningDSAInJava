package com.DataStructure.LinkedList;
public class SinglyLinkedList {
    private ListNode head;
    private ListNode tail;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Inserting nodes at the start of linkedList
    public void insertingNode(int data){
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }

    // Inserting nodes at the end of linkedlist
    public void insertNodesInEnd(int data){
    // Creating new node
        ListNode newNode = new ListNode(data);
    // If the linkedlist is empty create the node
        if (head == null) {
            head = newNode;
            return;
        }
    // Adding the new node into end of linked list for that need to traverse the all nodes
        ListNode current = head;
        while(current.next != null){
            current = current.next;
        }
    // when it reach end  that current.next is null add new node
        current.next = newNode;
    }


    // This method are used to display nodes in console
    public void display(){
    // Temp node as current to store the head data
        ListNode current = head;
    // Traversing the all nodes
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
        System.out.println("");
    }

    // finding the Quantity of linked list
    public int linkedListSize(){
        if(head == null ){
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    public static void main(String[] args) {
        SinglyLinkedList linkNodes = new SinglyLinkedList();

        linkNodes.insertingNode(10);
        linkNodes.insertingNode(15);
        linkNodes.insertingNode(20);

        linkNodes.insertNodesInEnd(18);
        linkNodes.insertNodesInEnd(11);

    // calling the method to display the linked list nodes
        System.out.println("Display LinkedList ");
        linkNodes.display();

    //  finding the size of linked list
        System.out.print("LinkedList Size: ");
        System.out.println(linkNodes.linkedListSize());

    }
}
