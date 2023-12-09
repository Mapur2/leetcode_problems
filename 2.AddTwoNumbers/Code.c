/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
 struct ListNode* insert(struct ListNode* head,int n){
    struct ListNode *p,*e;
    p=head;
    e=(struct ListNode *)malloc(sizeof(struct ListNode));
    e->val=n;
    e->next=NULL;
    if(head==NULL)
    {
        head=e;
        return head;
    }
    while(p->next!=NULL)
       p=p->next;
    p->next=e;
    return head;
 }

struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2){
    struct ListNode *h,*hh,*p=NULL;
    h=l1;
    hh=l2;
    int c=0,s=0;
    while(h!=NULL && hh!=NULL)
    {
        s=h->val+hh->val+c;
        if(s>9)
        {
            s=s%10;
            c=1;
        }
        else 
            c=0;

        p=insert(p,s);

        h=h->next;
        hh=hh->next;
    }
    while(h!=NULL)
    {
        s=h->val+c;
        if(s>9)
        {
            s=s%10;
            c=1;
        }
        else
            c=0;
        p=insert(p,s);
        h=h->next;
    }
    while(hh!=NULL)
    {
        s=hh->val+c;
        if(s>9)
        {
            s=s%10;
            c=1;
        }
        else
            c=0;
        p=insert(p,s);
        hh=hh->next;
    }
    if(c==1)
        insert(p,1);
    return p;
}