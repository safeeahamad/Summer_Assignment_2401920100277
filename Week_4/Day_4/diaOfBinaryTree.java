class Solution {
     public static int level(TreeNode root,int[] ans){
        if(root==null) return 0;
        int a=level(root.left,ans);
        int b=level(root.right,ans);
        ans[0]=Math.max(a+b,ans[0]);
        return 1+Math.max(a,b);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int []ans={Integer.MIN_VALUE};
        level(root,ans);
        return ans[0];
    }
}
