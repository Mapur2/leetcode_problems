/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* push(struct ListNode* head,int n)
{
    struct ListNode *e,*h;
    e=(struct ListNode*)malloc(sizeof(struct ListNode));
    e->val=n;
    e->next=NULL;
    if(head==NULL)
    {
        head=e;
        return head;
    }
    else
    {
        h=head;
        while(h->next!=NULL)
            h=h->next;
        h->next=e;
    }
    return head;
}
struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2){
    struct ListNode *l1,*l2,*head;
    head=NULL;
    l1=list1;
    l2=list2;
    while(l1!=NULL && l2!=NULL)
    {
        if(l1->val<=l2->val)
        {
            head=push(head,l1->val);
            l1=l1->next;
        }
        else
        {
            head=push(head,l2->val);
            l2=l2->next;
        }
    }
    while(l1!=NULL)
    {
            head=push(head,l1->val);
            l1=l1->next;
    }
    while(l2!=NULL)
    {
            head=push(head,l2->val);
            l2=l2->next;
    }
    return head;
}