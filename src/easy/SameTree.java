package easy;
 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class SameTree {
    public static void main(String[] args) {

        TreeNode node2=new TreeNode(2);
        TreeNode node3=new TreeNode(3);
        TreeNode node4=new TreeNode(4);
        TreeNode node5=new TreeNode(5);
        TreeNode node1=new TreeNode(1,node2,node3);
        TreeNode node33=new TreeNode(3,node4,node5);
        TreeNode node11=new TreeNode(1,node2,node33);
        System.out.println(isSameTree(node11,node1));



    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {

// 給定兩個tree，判斷是否結構完全一樣並且值也一樣

        if(p==null && q == null){
            return true;
        } else if (p == null || q ==null) {
            return false;
        }

        // 1.判斷此點的值
        if(p.val != q.val){
            return false;
        }
        // 2.判斷結構
        boolean leftIsExist=false;
        boolean rightIsExist=false;
        if(p.left==null && q.left==null){
            leftIsExist=false;

        } else if (p.left!=null &&q.left!=null) {
            leftIsExist=true;
        } else {
            return false;
        }

        if(p.right==null && q.right==null){
            rightIsExist=false;

        } else if (p.right!=null && q.right!=null) {
            rightIsExist=true;
        }else {
            return false;
        }

        if(leftIsExist && rightIsExist){
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        } else if (leftIsExist) {
            return isSameTree(p.left,q.left);
        } else if (rightIsExist) {
            return isSameTree(p.right,q.right);
        }else {
            return true;
        }






    }


    //利用遞迴，

    public static boolean isSameTree1(TreeNode p, TreeNode q) {


        if(p==null && q == null){
            return true;
        } else if (p == null || q ==null) {
            return false;
        }

        // 1.判斷此點的值
        if(p.val != q.val){
            return false;
        }
        // 2.判斷結構
        boolean leftIsExist=false;
        boolean rightIsExist=false;
        if(p.left==null && q.left==null){
            leftIsExist=false;

        } else if (p.left!=null &&q.left!=null) {
            leftIsExist=true;
        } else {
            return false;
        }

        if(p.right==null && q.right==null){
            rightIsExist=false;

        } else if (p.right!=null && q.right!=null) {
            rightIsExist=true;
        }else {
            return false;
        }



        // 3.判斷值
        if(leftIsExist){
            return isSameTree1(p.left,q.left);

        }


        if(rightIsExist){
return isSameTree1(p.right,q.right);
        }
return true;

    }


}
