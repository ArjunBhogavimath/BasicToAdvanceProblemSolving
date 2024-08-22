package LinkedList;

//https://leetcode.com/problems/linked-list-cycle-ii/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LinkedListCycle2 {
    public ListNode detectCycle(ListNode head) {
        // if(head == null || head.next == null) return null;
        // Map<ListNode, Integer> map = new HashMap<>();
        // ListNode temp = head;
        // int count = 0;
        // while(temp != null){
        //     if(map.containsKey(temp)) return temp;
        //     map.put(temp,count++);
        //     temp = temp.next;
        // }
        // return null;
        if(head == null || head.next == null) return null;
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                if(slow == fast) return slow;
            }
        }
        return null;
    }

}

/**
 1.Naive solution: Using hashMap
 TC : O(2n+), SC: O(n)

 2. Optimal solution: Using tortoise and hare algorithm
 after finding out the cycle is present
 now move slow to the head, and leave the fast at the collision point
 now move both of them only 1 step at a time.
 the position they collide is the starting point of the cycle
 TC : O(n), SC: O(1)
 */