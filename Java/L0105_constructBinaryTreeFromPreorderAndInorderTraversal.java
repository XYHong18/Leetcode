/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

public class L0105_constructBinaryTreeFromPreorderAndInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) { 
        if (preorder.length==0) return null;
        
        return helper(preorder, inorder, 0, 0, inorder.length);
    }
    
    private TreeNode helper(int[] preorder, int[] inorder, int preStart, int inStart, int inEnd) {
        if (inStart>=inEnd) return null;
        
        TreeNode root = new TreeNode(preorder[preStart]);
        
        int breakIndex=0;
        
        for (int i=0; i<inEnd; i++) {
            if (inorder[i]==preorder[preStart]) {
                breakIndex = i;
                break;
            }
        }
        
        root.left = helper(preorder, inorder, preStart+1, inStart, breakIndex);
        root.right = helper(preorder, inorder, preStart+breakIndex-inStart+1, breakIndex+1, inEnd);
        
        return root;
    }
}