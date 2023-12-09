/**
 * Definition for a binary tree struct TreeNode*.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */

struct TreeNode* removeNode(struct TreeNode *t)
{
	if(t->left==NULL && t->right==NULL)
		return NULL;
	else if(t->left==NULL)
		return t->right;
	else if(t->right==NULL)
		return t->left;
	struct TreeNode *is,*r,*pre;
	is=t->right;
	if(is->left==NULL)
	{
		is->left=t->left;
		t=is;
		return t;
	}
	pre=t;
	while(is->left!=NULL)
	{
		pre=is;
		is=is->left;
	}
	r=is->right;
	is->right=t->right;
	is->left=t->left;
	t=is;		
		pre->left=r;
	return t;
}

struct TreeNode* deleteNode(struct TreeNode* root, int v)
{
    if(root==NULL)
		return NULL;
	if(root->val==v)
		return removeNode(root);
	struct TreeNode *t,*p;
	t=root;
	p=t;
	while(t!=NULL)
	{
		if(t->val==v)
		{
			if(p->val > t->val)
				p->left=removeNode(t);
			else
				p->right=removeNode(t);
            break;
		}
		else if(t->val > v)
		{
			p=t;
			t=t->left;
		}
		else
		{
			p=t;
			t=t->right;
		}
	}
	return root;
}

