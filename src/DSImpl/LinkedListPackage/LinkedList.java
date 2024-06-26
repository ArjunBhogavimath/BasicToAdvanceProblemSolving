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

        //traverse in ll
       traverseLL(head);

        System.out.println();
       //lenght of ll
        System.out.println("Length of LinkedList : "+lengthOfLL(head));

//        //search element
//        System.out.println("Is element 5 present : "+searchEle(head,5));
//
//        //deleteHead
//        Node head2 = deleteHead(head);
//        System.out.println("this is after deleting 1st head pointing to 2nd value --> "+head2.data);
//        traverseLL(head2);
//
//        //deleteTail
//        Node head3 = deleteLast(head);
//        System.out.println("this is after deleting tail --> "+head3.data);
//        traverseLL(head3);
//
//        //deleteKthEle
//        Node head4 = deleteKthPostition(head,1);
//        System.out.println("this is after deleting Kth element --> "+head4.data);
//        traverseLL(head4);
//
//        //deleteByValue
//        Node head5 = deleteElement(head,2);
//        System.out.println("this is after deleting by element --> "+head5.data);
//        traverseLL(head5);

        //insertAtHead
        Node hed6 = insertAtHead(head,90);
        traverseLL(hed6);
        System.out.println();

        //insertAtTail
        Node head7 = insertAtTail(head, 98);
        traverseLL(head7);
        System.out.println();

        //insertAtKthPosition
        Node head8 = insertAtKthPosition(head, 120,6);
        traverseLL(head8);
    }

    public static Node insertAtKthPosition(Node head, int val, int k){
        //handles if the head is empty and k is 1
        if(head == null){
            if(k == 1){
                return new Node(val);
            }
        }

        //check if head is not null and add at 1st place
        if(k == 1){
            return new Node(val, head);
        }

        //now check for k >= 2

        Node temp = head;
        int count = 0; //we always have to stop at k-1 stop to add new node

        while(temp != null){
             count++;
             //stand at 1 place before the k
             if(k-1 == count){
                 //create a new node for the new value and assign temp next to x next
                  Node x = new Node(val,temp.next);
                  temp.next = x; //now make x as temp next
                  break;
             }
              temp = temp.next;
        }
        return head;
    }

    public static Node insertAtTail(Node head, int val){
        if(head == null) {
            return new Node(val);
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(val);
        return head;
    }

    public static Node insertAtHead(Node head, int val){
        //create new Node with new value as data and existing head as next
        Node temp = new Node(val, head);
        return temp;
    }

    public static Node deleteElement(Node head, int val){
        if(head == null) return head;

        //delete head
        if(head.data == val) {
            head = head.next;
            return head;
        }
        Node temp = head;
        Node prev = null;
        while(temp != null ){
            if(temp.data == val){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    public static Node deleteKthPostition(Node head, int k){
        if(head == null) return head;

        //delete head
        if(k == 1) {
            head = head.next;
            return head;
        }
        Node temp = head;
        int counter = 0;
        Node prev = null;
        while(temp != null ){
            //temp = temp.next;
            counter++;
            if(counter == k){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;

        }
        return head;
    }

    public static Node deleteLast(Node head){
        //if only 1 element in list or none
        if(head == null || head.next == null) return null;
        Node temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public static Node deleteHead(Node head){
        if(head != null) {
            head = head.next;
        }
        return head;
    }

    public static boolean searchEle(Node head, int search_ele){
        Node temp = head;
        while (temp!=null){
            if(temp.data == search_ele) return true;
            temp = temp.next;
        }
        return false;
    }

    public static void traverseLL(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+", ");
            temp = temp.next;
        }
    }

    public static int lengthOfLL(Node head){
        int count =0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        return count;
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