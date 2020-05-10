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

public class L02_addTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode();
        ListNode res = temp;
        int carry = 0, v1 = 0, v2 = 0;
        
        while (l1 != null || l2 != null) {
            temp.next = new ListNode();
            temp = temp.next;
            
            if (l1 != null) {
                v1 = l1.val;
                l1 = l1.next;
            } else {
                v1 = 0;
            }
            
            if (l2 != null) {
                v2 = l2.val;
                l2 = l2.next;
            } else {
                v2 = 0;
            }
            
            temp.val = (v1 + v2 + carry) % 10;
            carry = (v1 + v2 + carry) / 10;
        }
        
        if (carry != 0) {
            temp.next = new ListNode();
            temp = temp.next;
            temp.val = carry;
        }
        
        return res.next;
    }
}