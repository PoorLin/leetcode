package easy;

public class CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
       if(root == null) {
           return 0;
       }
       int depth=(findLongestTreeRes(root));
       //先抓到最深的子樹

return countNodesRes(root,depth,1);
    }

    public static int countNodesRes(TreeNode root,int depth,int nowDep) {
        if(root.right!=null && root.left!=null){
            int a=countNodesRes(root.left,depth,nowDep+1);
            int b=countNodesRes(root.right,depth,nowDep+1);
            return a+b+1;
        }else if (root.right !=null){
            int a = countNodesRes(root.right,depth,nowDep);
            if(depth-1 == nowDep){
                return 1+a;
            }else {
                return 0+a;
            }

        }else if (root.left !=null){

            int a = countNodesRes(root.left,depth,nowDep);
            if(depth-1 == nowDep){
                return 1+a;
            }else {
                return 0+a;
            }
        }else {
      return 1;

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
