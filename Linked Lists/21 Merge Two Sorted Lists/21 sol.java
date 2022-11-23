/**
 * Time: O(M + N)
 * Space: O(1)
 * 
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode helper = head; //use a helper pointer to be able to return to head node at the end
        
        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                helper.next = list1;
                list1 = list1.next;
            }
            else {
                helper.next = list2;
                list2 = list2.next;
            }
            helper = helper.next;
        }
        
        if(list1 != null) {
            helper.next = list1;
        }
        else if(list2 != null) {
            helper.next = list2;
        }
        
        return head.next;
    }
}