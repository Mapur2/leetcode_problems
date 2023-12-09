/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteDuplicates(struct ListNode* head){
    if(head==NULL)
        return head;
    struct ListNode *h,*m;
    h=head;
    while(h->next!=NULL)
    {
        m=h;
        while(m->next!=NULL)
        {
            if(h->val==m->next->val)
                m->next=m->next->next;
            else
                m=m->next;
        }
        if(h->next!=NULL)
        h=h->next;
    }
    return head;
}