/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
  int size(struct ListNode* head)
 {
     int i=0;
     while(head->next!=NULL)
        {
            i++;
            head=head->next;
        }
    return i;
 }
int getDecimalValue(struct ListNode* head){
    int s=size(head),ss=0;
    while(head!=NULL)
    {
        ss+=(pow(2,s)*head->val);
        s--;
        head=head->next;
    }
    return ss;
}