package LinkedList;


/****************************************************************

 Following is the Linked list node structure already written:-

 https://www.naukri.com/code360/problems/rearrange-odd-and-even-places_920379?utm_source=youtube&utm_medium=affiliate&utm_campaign=Codestudio_Linkedlistseries&leftPanelTabValue=SUBMISSION
 *****************************************************************/
 class Node
 {
 public int data;
 public Node next;

 Node()
 {
 this.data = 0;
 this.next = null;
 }

 Node(int data)
 {
 this.data = data;
 this.next = null;
 }
 }




public class OddAndEvenRerrange {
    public static Node oddEvenList(Node head) {
        // Write your code here.4
        if(head == null || head.next == null) return head;

        Node odd = head;
        Node even = head.next;

        //Memorize even head
        Node evenHead = even;

        //we only need to check for even as odd is bound to be behind even
        // so even and even.next shouldn't be null
        while(even != null && even.next != null){
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }
        //now link odd last element to even head
        odd.next = evenHead;

        return head;
    }
}


/*
1. Naive solution

traverse through array twice once for odd and another time for even place
store the elements in array
traverse again and replace data of linkedlist

Tc : O(2n) Sc : O(n)

2. Optimal solution

take 2 points odd and even.
odd should point to head. and even should point to head.next
store the even in different variable for future use
now run a loop where odd will link its next to next odd. and same for even
at last at the end odd element will link next to even head.

TC : O(N) SC : O(1)
*/
