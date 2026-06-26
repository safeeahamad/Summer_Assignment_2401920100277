class Solution {
    public static TreeNode cons(int[] pre,int[] in,int prelo,int prehi,int inlo,int inhi){
        if(prelo>prehi || inlo>inhi) return null;
        int r=0;
        while(in[r]!=pre[prelo]) r++;
        TreeNode node=new TreeNode(in[r]);
        int lefts=r-inlo;
        node.left=cons(pre,in,prelo+1,prelo+lefts,inlo,r-1);
        node.right=cons(pre,in,prelo+1+lefts,prehi,r+1,inhi);
        return node;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n=inorder.length;
        return cons(preorder,inorder,0,n-1,0,n-1);
    }
}
