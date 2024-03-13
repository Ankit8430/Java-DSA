package LinkedList;

import recursion.basicRecursion;

public class SinglyLinkedListBasic {
    private int size;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    //Create constructor
    SinglyLinkedListBasic(){
        this.size=0;
    }
    //Create Head
    Node head;
    //Add --> first;
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    }
    //Add --> Last;
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    //Remove First
    public void deleteFirst(){
        if (head==null) {
            System.out.println("List is Empty");
        }
        size--;
        head=head.next;
    }
    //Remove Last
    public void deleteLast(){
        if (head==null) {
            System.out.println("List is Empty");
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLastNode=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLastNode=secondLastNode.next;
        }
        secondLastNode.next=null;
    }
    public void printLinkedList(){
        if(head==null){
            System.out.println("Linked List is Nulll");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"-->");
            currNode=currNode.next;
        }
        System.out.println("Null");
    }
    public int getSize(){
        return this.size;
    }
    public Node reverseLinkedListRecursive(Node head){
        if(head==null || head.next==null){
            return head;
        }
         Node newHead=reverseLinkedListRecursive(head.next);
         head.next.next=head;
         head.next=null;
         return newHead;
    }
    public void reverseLinkedList(){
        if(head==null || head.next==null){
            return;
        }
        Node preNode=head;
        Node currNode=head.next;

        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=preNode;

            //Update
            preNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=preNode;
    }
    public static void main(String[] args){
        SinglyLinkedListBasic list=new SinglyLinkedListBasic();
        list.addFirst("is");
        list.addLast("a");
        list.printLinkedList();
        list.addLast("list");
        list.printLinkedList();
        list.addFirst("This");
        list.printLinkedList();
        //list.reverseLinkedList();
        list.printLinkedList();
        list.head=list.reverseLinkedListRecursive(list.head);
        list.printLinkedList();
    }
}
