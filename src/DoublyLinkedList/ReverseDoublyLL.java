package DoublyLinkedList;

import java.util.Stack;

class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}


public class ReverseDoublyLL {

public static Node reverseDLL(Node  head)
{
    //for optimized solution we need to swap links

    if(head == null || head.next == null) return head;

    Node temp = head;
    Node last = null;

    while(temp != null){
        last = temp.prev;
        temp.prev = temp.next;
        temp.next = last;

        temp = temp.prev; //link reversed so this is previous one
    }

    return last.prev; // last is at 1 place before the head, so return that




    //naive solution --> Takes o(2n) time and extra space

    // Node temp = head;

    // Stack<Integer> stack = new Stack<>();

    // while(temp != null){
    //     stack.push(temp.data);
    //     temp = temp.next;
    // }

    // temp = head;

    // while(temp != null){
    //     temp.data = stack.pop();
    //     temp = temp.next;
    // }
    // return head;
}
}
