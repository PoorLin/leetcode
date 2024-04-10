package easy;

import static easy.InvertBinaryTree.invertTreeRes;

public class SymmetricTree {
    public static void main(String[] args) {
        invertTreeRes(root);
    }
    public static boolean isSymmetric(TreeNode root) {
        invertTreeRes(root.left);



return isSymmetricRec(root.left,root.right);
    }
    public static boolean isSymmetricRec(TreeNode leftNode,TreeNode rightNode) {
        




        return false;
    }
}
