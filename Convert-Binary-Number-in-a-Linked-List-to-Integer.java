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
        String s="";
        while(head!=null){
            s+= String.valueOf(head.val);
            head=head.next;
        }
        // int a=Integer.parseInt(s);

        // System.out.println(s);
        return Integer.parseInt(s,2);
        
    }
}