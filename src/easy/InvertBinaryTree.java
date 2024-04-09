package easy;

public class InvertBinaryTree {


    public static TreeNode invertTree(TreeNode root) {
        if(root == null){
            return root;
        }
        invertTreeRes(root);
return root;
    }
    public static void invertTreeRes(TreeNode root) {
        if (root==null){
            return;
        }
        invertTreeRes(root.right);
        invertTreeRes(root.left);
        TreeNode tmp=root.left;
        root.left=root.right;
        root.right=tmp;
    }

}
