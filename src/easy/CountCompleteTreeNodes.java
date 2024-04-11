package easy;

public class CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
       if(root == null) {
           return 0;
       }
       int depth=(findLongestTreeRes(root));
       //先抓到最深的子樹

return 1;
    }

    public static int countNodesRes(TreeNode root,int depth,int nowDep) {
        if(root.right !=null && root.left!=null){
            countNodesRes(root.left,depth,nowDep+1);
            countNodesRes(root.right,depth,nowDep+1);
        } else if (root.right !=null) {
            if(nowDep)

        } else if (root.right !=null){

        }else {


        }

    }
    public static int findLongestTreeRes(TreeNode root) {
            if(root.left==null && root.right==null){
                return 1;
            }else if(root.right !=null && root.left!=null){
                return (Math.max(findLongestTreeRes(root.right),findLongestTreeRes(root.left)))+1;


            }else if(root.right!=null){
                return findLongestTreeRes(root.right)+1;
            } else if (root.left!=null) {
                return findLongestTreeRes(root.left)+1;
            }else {
                return 0;
            }

    }

}
