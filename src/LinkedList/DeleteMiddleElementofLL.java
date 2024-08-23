package LinkedList;

//https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class DeleteMiddleElementofLL {
    public ListNode deleteMiddle(ListNode head) {
        // if(head == null || head.next == null) return null;
        // ListNode slow = head;
        // ListNode fast = head;
        // ListNode beforeMiddle = null;
        // while(fast != null && fast.next != null){
        //     beforeMiddle = slow;
        //     slow = slow .next;
        //     fast = fast.next.next;
        // }
        // beforeMiddle.next = slow.next;
        // slow.next = null;
        // return head;

        if(head == null || head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head.next.next; //this will skip 1 step for slow

        while(fast != null && fast.next != null){
            slow = slow .next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}

/**
 1. Naive solution :


 2.Optimal solution : Tortoise and hare algorithm
 store slow everytime it reaches next step replace with new one (this way we can get prev ele)
 after getting the middle point take prev.next = middle.next and middle .next = null
 TC : O(n/2) SC : O(1)

 3. Without 3rd variable: Tortoise and hare (modified)
 */