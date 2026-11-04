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
class Solution {
    public int getDecimalValue(ListNode head) {
        
        ListNode prev = null;
        ListNode cur = head;

        while(cur != null){
            ListNode next = cur.next;
            cur.next = prev;
            
            prev = cur;
            cur = next;            
        }

        head = prev;

        ListNode temp = head;
        int res = 0;
        int cnt = 0;

        while(temp != null){
           if(temp.val == 1){
             res += Math.pow(2, cnt);
           }
           cnt++;

           temp = temp.next;
        }

        return res;
    }
}