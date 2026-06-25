class Solution {
    public boolean hasPathSum(TreeNode root, int tar) {
        if(root==null) return false;
        if(root.left==null && root.right==null && tar==root.val) return true;
        tar-=root.val;
        return hasPathSum(root.left,tar) || hasPathSum(root.right,tar);        
    }
}
