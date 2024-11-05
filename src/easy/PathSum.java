package easy;

import java.util.HashSet;
import java.util.Set;

public class PathSum {


    public boolean hasPathSum(TreeNode root, int targetSum) {
         Set<Integer> sumSet = new HashSet<>();
         if (root==null){
             return false;
         }
    hasPathRes(root,root.val,sumSet);

return sumSet.contains(targetSum);
    }
    public void hasPathRes(TreeNode root, int targetSum, Set<Integer> sumSet) {
        if(root.right == null && root.left == null){
            sumSet.add(targetSum);
        }
        if (root.left!=null && root.right!=null) {
            hasPathRes(root.left,targetSum+root.left.val,sumSet);
            hasPathRes(root.right,targetSum+root.right.val,sumSet);
        }else if(root.left!=null){
            hasPathRes(root.left,targetSum+root.left.val,sumSet);
        } else if (root.right!=null) {
            hasPathRes(root.right,targetSum+root.right.val,sumSet);
        }



    }



    public boolean hasPathSumBetter(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        if(root.val == targetSum && root.left == null && root.right == null){
            return true;
        }

        return hasPathSumBetter(root.left,targetSum-root.val) || hasPathSumBetter(root.right,targetSum- root.val);
    }

}
