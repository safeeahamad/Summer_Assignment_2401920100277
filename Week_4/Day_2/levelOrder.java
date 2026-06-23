class Solution {
    public static int levels(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(levels(root.left),levels(root.right));
    }
    public static void travel(TreeNode root,List<List<Integer>> arr,int lvl){
        if(root==null) return ;
        arr.get(lvl).add(root.val);
        travel(root.left,arr,lvl+1);
        travel(root.right,arr,lvl+1);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        int lvl=levels(root);
        for(int i=0;i<lvl;i++){
            ans.add(new ArrayList());
        }
        travel(root,ans,0);
        return ans;
    }
}
