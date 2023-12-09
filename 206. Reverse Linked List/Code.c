/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseList(struct ListNode* head){
    if(head==NULL)
        return head;
    else
    {
        struct ListNode *h=head,*m,*p=NULL;
        while(h!=NULL)
        {
            m=h->next;
            h->next=p;
            p=h;
            h=m;
        }
        return p;
    }
}