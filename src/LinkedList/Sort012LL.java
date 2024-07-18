package LinkedList;

/****************************************************************

 Following is the class structure of the Node class:
 https://www.naukri.com/code360/problems/sort-linked-list-of-0s-1s-2s_1071937?utm_source=youtube&utm_medium=affiliate&utm_campaign=Codestudio_Linkedlistseries&leftPanelTabValue=SUBMISSION


 class Node {
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

 Node(int data, Node next)
 {
 this.data = data;
 this.next = next;
 }
 }

 *****************************************************************/

public class Sort012LL
{
    public static Node sortList(Node head) {
        // Write your code here
        if(head == null || head.next == null) return head;

        Node temp = head;

        //create dummy nodes for each value
        Node zeroHead = new Node(-1);
        Node oneHead = new Node(-1);
        Node twoHead = new Node(-1);

        Node zero = zeroHead;
        Node one = oneHead;
        Node two = twoHead;

        while(temp != null){
            if(temp.data == 0){
                zero.next = temp;
                zero = zero.next;
            }
            else if(temp.data == 1){
                one.next = temp;
                one = one.next;
            }
            else{
                two.next = temp;
                two = two.next;
            }
            temp = temp.next;
        }

        //now i should link all 3 nodes (from 0 to 1 and 1 to 2)

        //if the 1 is not there then we need to connect directly to two so this condition
        //zero is at last of zero dummy node
        zero.next = oneHead.next != null ? oneHead.next : twoHead.next;

        //now one will be at the end of 1 dummy node
        one.next = twoHead.next;

        //now the last element should point to null
        two.next = null;

        //here we should return zerohead's next because zerohead will be pointing towards -1 so it's next should be returned
        return zeroHead.next;
    }
}


/*

1. Naive solution ( 2 PHARSE)

take 3 counters for 0 1 and 2
traverse ll once and fil the counts
and again traverse the ll once again, now start doing data replacements
from 0 to 2.
1st put all the zeroes follwed by 1 and 2
now return head;

TC : 0(2N) SC : O(1)


2.Optimal solution

we can take 3 dummy nodes naming zeroHead, oneHead, twoHead with -1 as as data
and 3 points zero one two will be taken as reference for these resp..

now traverse the array and when you find 0, link zero.next to that. and same for other two
remember we are not creating any new nodes, just linking is changing

at last when everything is done. now connect zero.next to one head (if 1 is present)
and 1 will connect to 2 head (if 2 is present)
now return head

TC : O(N) SC : O(1)

*/
