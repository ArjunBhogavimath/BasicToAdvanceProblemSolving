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

//        Node head1 = deleteHead(head);
//        traverseLL(head1);

//        Node head1 = deleteTail(head);
//        traverseLL(head1);

//        Node head1 = deleteKthPosition(head, 5);
//        traverseLL(head1);

        Node head1 = deleteElement(head,91);
        traverseLL(head1);
    }

    public static Node deleteElement(Node head, int val){
        if(head == null){
            return null;
        }

        //delete head
        if(head.data == val){
            head = head.next;
            head.before = null;
            return head;
        }

        Node temp = head;
        Node prev;
        Node front;
        while(temp != null){
            if(temp.data == val){
                prev = temp.before;
                front = temp.next;

                prev.next = front;
                if(front != null) front.before = prev;
                temp.next = null;
                temp.before = null;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    public static Node deleteKthPosition(Node head, int position){
        if(head == null) return null;

        int count = 0;
        Node temp = head;

        while(temp != null){
            count++;
            if(count == position){
                break;
            }
            temp = temp.next;

        }
        Node back = temp.before;
        Node front = temp.next;

        if(back == null && front == null){
            return null;
        }
        else if(back == null){
            return deleteHead(head);
        }
        else if(front == null){
            return deleteTail(head);
        }

        back.next = front;
        front.before = back;
        temp.before = null;
        temp.next = null;

        return head;
    }

    public static Node deleteTail(Node head){
        if(head == null || head.next == null) return null;

        Node temp = head; //to make head.next as null

        while(temp.next.next != null){
            temp = temp.next;
        }
       Node last = temp.next;
        temp.next = null;
        last.before = null;

        return head;
    }

    public static Node deleteHead(Node head){
        if(head == null || head.next == null) return null;

        Node prev = head; //to make head.next as null
        head = head.next;
        head.before = null;

        prev.next = null;

        return head;
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

