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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ArrayList<ListNode> a=new ArrayList<>();
        ListNode h,p;
        h=head;
        int i;
        while(h!=null)
        {
            a.add(h);
            h=h.next;
        }
        int s=a.size();
        for(i=s-1;i>-1 && n!=1 ;i--)
        {
            n--;
        }
        if(i==0)
            return head.next;
        h=head;p=head;
        s=0;
        while(s!=i)
        {
            p=h;
            h=h.next;
            s++;
        }
        p.next=h.next;
        return head;
    }
}