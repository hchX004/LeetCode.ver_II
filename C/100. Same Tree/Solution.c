// 20190131

// my answer

/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */

bool isSameTree(struct TreeNode* p, struct TreeNode* q) {
    if(p == NULL && q == NULL) return 1;
    else if(p == NULL || q == NULL) return 0;
    else if(p->val == q->val){
        if(isSameTree(p->left, q->left) && isSameTree(p->right, q->right)) return 1;
        else return 0;
    }
    else return 0;
}

//best answer

/*
bool isSameTree(struct TreeNode* p, struct TreeNode* q) {
    if(p&&q)
        return(p->val==q->val)&&isSameTree(p->left,q->left)&&isSameTree(p->right,q->right);
    else if(p==NULL&&q==NULL)
        return true;
    else 
        return false;
}
*/