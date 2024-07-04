package LinkedList;
//https://leetcode.com/problems/add-two-numbers/

 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
    ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Add2Numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode(-1); //created dummy node
        ListNode current = dummyNode; // starting from dummy node

        int carry = 0; //this is for storing carry while adding

        ListNode temp1 = l1;
        ListNode temp2 = l2;

        while(temp1 != null || temp2 != null){ //on;y go when one of the list is not empty
            int sum = carry;  //decalre sum as carry
            if(temp1 != null) sum += temp1.val; //add the value to sum if the list is not empty
            if(temp2 != null) sum += temp2.val;

            ListNode newNode = new ListNode(sum % 10);//create new node with sum but run modulo
            carry = sum/10; // here the carry will hold the carry number

            current.next = newNode; // now connect the newly created node from current
            current = current.next; // move curret to newly created node

            if(temp1 != null) temp1 = temp1.next; //now move to next element if it have data
            if(temp2 != null) temp2 = temp2.next;
        }
        //once come out of the loop, check if carry is still remanining
        if(carry !=0 ){
            ListNode lastNode = new ListNode(carry); //if yes, create new node add data.
            current.next = lastNode; //and link with new node
        }

        return dummyNode.next;
    }
}

/*
we need to take a dummy node approach

1. create a dummy node
2. and start adding in normal addiition
3. decalre a carry variable to place carry
4.return dummy.next's head while returning

TC, SC--> O(MAX(L1,L2))

*/

