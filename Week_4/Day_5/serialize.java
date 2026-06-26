public class Codec {
    public String serialize(TreeNode root) {
        if(root==null) return "N,";
        StringBuilder sb=new StringBuilder();
        sb.append(root.val).append(",");
        sb.append(serialize(root.left));
        sb.append(serialize(root.right));
        return sb.toString();
    }
    int idx=0;
    public TreeNode deserialize(String data) {
        String[] arr=data.split(",");
        return build(arr);
    }
    
    private TreeNode build(String[] arr){
        if(arr[idx].equals("N")){
            idx++;
            return null;
        }
        TreeNode node=new TreeNode(Integer.parseInt(arr[idx++]));
        node.left=build(arr);
        node.right=build(arr);
        return node;
    }
}
