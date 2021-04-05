// 20210315

/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */

struct TreeNode* mirrorTree(struct TreeNode* root){
    if (root == NULL) {
        return root;
    }
    mirrorTree(root->right);
    mirrorTree(root->left);
    struct TreeNode* p = root->left;
    root->left = root->right;
    root->right = p;
    return root;  
}