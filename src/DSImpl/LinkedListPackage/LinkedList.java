package DSImpl.LinkedListPackage;


//Node means a single unit which will have data and next address
class Node {
    int data;
    Node next; //next address will be another node

    //constructor which has next value
    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    //constuctor for last element
    Node(int data){
        this.data = data;
        this.next  = null; //the last element will be pointing towards null
    }
}

public class LinkedList {

    public static void main(String[] args) {
        int[] arr = {2,4,6,3};
        Node node = new Node(arr[3]);
        System.out.println(node.data);
        System.out.println(node.next);
    }
}
