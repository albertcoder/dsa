/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int size1 = 0; int size2 = 0;
        ListNode curr1 = headA;
        while (curr1 != null) {
            curr1 = curr1.next;
            size1++;
        }
        
        ListNode curr2 = headB;
        while (curr2 != null) {
            curr2 = curr2.next;
            size2++;
        }
        curr1 = headA;
        curr2 = headB;
        if (size1 > size2) {
           int diff = size1 - size2;
            for (int i = 0 ; i < diff; i++) {
                curr1 = curr1.next;
            }
            while (curr1 != curr2) {
                curr1 = curr1.next;
                curr2 = curr2.next;
            }
            return curr1;
        } else if (size2 > size1) {
           int diff = size2 - size1;
            for (int i = 0 ; i < diff; i++) {
                curr2 = curr2.next;
            }
            while (curr1 != curr2) {
                curr1 = curr1.next;
                curr2 = curr2.next;
            }
            return curr1;
            
        } else {
            while (curr1 != curr2) {
                curr1 = curr1.next;
                curr2 = curr2.next;
            }
            return curr1;
        }
    }
}