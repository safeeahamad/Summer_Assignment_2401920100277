class Solution {
    public static boolean issame(TreeNode r,TreeNode s){
        if(r==null && s==null ) return true;
        else if(r==null || s==null ) return false;
        if(r.val == s.val) return issame(r.left,s.right) && issame(r.right,s.left);
        else return false;
    }
    public boolean isSymmetric(TreeNode root) {
        return issame(root.left,root.right); 
    }
}
