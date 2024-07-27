package LinkedList;


/****************************************************************
 https://www.naukri.com/code360/problems/delete-kth-node-from-end_799912?utm_source=youtube&utm_medium=affiliate&utm_campaign=Codestudio_Linkedlistseries&leftPanelTabValue=SUBMISSION

 Following is the class structure of the Node class:

 class Node {
 public int data;
 public Node next;
 public Node prev;

 Node()
 {
 this.data = 0;
 this.next = null;
 this.prev = null;
 }

 Node(int data)
 {
 this.data = data;
 this.next = null;
 this.prev = null;
 }

 Node(int data, Node next)
 {
 this.data = data;
 this.next = next;
 this.prev = next;
 }
 };

 *****************************************************************/

public class DeleteKthNodeFromEnd
{
    public static Node removeKthNode(Node head, int K)
    {
        //1. Naive solution (0(2N))
        // // Write your code here.
        // int count = 0;
        // Node temp = head;

        // //get the length
        // while(temp!=null){
        //     count++;
        //     temp = temp.next;
        // }

        // //check if the head
        // if(count == K){
        //     head = head.next; //removing link to the head
        //     return head;
        // }

        // int target_node = count - K;

        // //now temp is at some other place so make it at head again
        // temp = head;

        // while(temp!=null){
        //     target_node--; //decrement this so the 0 will be the target place

        //     if(target_node == 0){
        //         break; //break the loop as we found our element
        //     }
        //     temp = temp.next;
        // }

        // //temp is now at the 1 place behind the target deletion element, so we need to make temp next as next.next
        // temp.next = temp.next.next;

        // return head;


        //2. Optimal solution ()
        Node fast = head;

        for(int i=0; i<K; i++){
            fast = fast.next; //now fast is at the index
        }

        //check for head as at that time fast will be null
        if (fast == null){
            return head.next;
        }

        Node slow = head;

        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }


        //now slow is at the target node behind.
        slow.next = slow.next.next;
        return head;
    }
}


/*

1. Naive solution
take counter. iterate through linedlist once, get the length
now we know the length and target element
we can substract length-n this will give me the before element so we can connect that to temp.next.next
now we can return head
time complexity : O(len)+ O(len-n) = O(2n)...
SC : O(1)

2. Optimal Solution (Slow and fast pointer)
Take 2 pointer slow and fast
we can directly move fast to Kth times.
and after that start moving fast from that point
and slow from head 1 step at a time
stop when fast.next == null
now do the operation and return head

TC : O(len) SC : O(1)
*/

