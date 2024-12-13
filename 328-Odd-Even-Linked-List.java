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
    public ListNode oddEvenList(ListNode head) {
        ListNode l1=new ListNode();
        ListNode l2=new ListNode();
        ListNode odd=l1,even=l2;
        int i=1;
        while(head!=null){
            int val1=head.val;
            if(i%2!=0){
                odd.next=new ListNode(val1);
                odd=odd.next;
            }else{
                even.next=new ListNode(val1);
                even=even.next;
            }
            i++;
            head=head.next;
        }
        odd.next=l2.next;
        return l1.next;
    }
}