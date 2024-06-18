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
//        Node node = new Node(arr[3]);
//        System.out.println(node.data);
//        System.out.println(node.next);
        Node head = convertArrToLL(arr);
        System.out.println(head.data);
    }

    public static Node convertArrToLL(int[] arr){
        //mark the head as arr[0] by creating new node 1st
        Node head = new Node(arr[0]);

        //create mover variable to link head to next element
        Node mover = head;

        for(int i=1;i<arr.length;i++){
            //create temp variable to store the elements and link to previous one
            Node temp = new Node(arr[i]);
            //now link mover next to temp
            mover.next = temp;
            //now move the mover to last element
            mover = temp;
        }
        return head;
    }
}


/*
Basic notes :
Memory allocation :
32-bit -->
int -> 4 bytes
next -> 4 bytes

64-bit -->
int -> 4 bytes
next -> 8 bytes

TC FOR ADDING ARRAY -> O(N)
 */