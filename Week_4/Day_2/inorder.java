class Solution {
    public static List<Integer> inorder(TreeNode root, List<Integer> arr){
        if(root==null) return arr;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
        return arr;

    }
    public List<Integer> inorderTraversal(TreeNode root) {
        return inorder(root,new ArrayList<>());
    }
}
