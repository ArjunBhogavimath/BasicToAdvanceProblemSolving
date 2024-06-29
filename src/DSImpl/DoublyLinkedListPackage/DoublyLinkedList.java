package DSImpl.DoublyLinkedListPackage;

class Node{
    int data;
    Node next;
    Node before;

    Node(int data){
        this.data = data;
        this.next = null;
        this.before = null;
    }

    Node(int data, Node next, Node before){
        this.data = data;
        this.next = next;
        this.before = before;
    }
}


public class DoublyLinkedList {
    public static void main(String[] args) {
        int arr[] = {4, 6 ,22, 6, 91};
        Node head = convertToDoublyLL(arr);
        traverseLL(head);
    }

    public static void traverseLL(Node head){
        System.out.println("This is Doubly Linked list : ");
        while (head != null){
            System.out.print(head.data+",");
            head = head.next;
        }
        System.out.println();
    }

    public static Node convertToDoublyLL(int []arr){
        //at first i should create a node for the head and that would be 1st element of array
        Node head = new Node(arr[0]);
        //storing current pointer
        Node prev = head;

        for(int i =1; i< arr.length;i++){
            //create a new node for next element
            Node temp = new Node(arr[i], null, prev); //link this node before to previous and next to null
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
}

