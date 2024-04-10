package easy;

import static easy.InvertBinaryTree.invertTreeRes;

public class SymmetricTree {
    public static void main(String[] args) {

    }
    public static boolean isSymmetric(TreeNode root) {
        invertTreeRes(root.left);
return isSymmetricRecRes(root.left,root.right);
    }


    public static boolean isSymmetricRecRes(TreeNode leftNode,TreeNode rightNode) {
        if (leftNode==null && rightNode==null){
            return true;
        }else if(leftNode!=null && rightNode!=null){

            boolean leftBol=isSymmetricRecRes(leftNode.left,rightNode.left);
            boolean rightBol=isSymmetricRecRes(leftNode.right,rightNode.right);
            if(!leftBol || !rightBol){
                return false;
            }
            if(leftNode.val != rightNode.val){
                return false;
            }else {
                return true;
            }
        }else {
            return false;
        }
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
