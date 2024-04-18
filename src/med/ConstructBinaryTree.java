package med;

import java.util.*;

public class ConstructBinaryTree {
     public static class TreeNode {
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

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 1){
            return new TreeNode(preorder[0]);
        }


        TreeNode head= new TreeNode(preorder[0]);
        LinkedList<Integer> preoderList = new LinkedList<>();
          for(int index=0;index<preorder.length;index++){
              preoderList.add(preorder[index]);
          }
        LinkedList<Integer> inoderList = new LinkedList<>();
        for(int index=0;index<inorder.length;index++){
            inoderList.add(inorder[index]);
        }
        System.out.println(preoderList.size());
        System.out.println(inoderList.size());
          buildTreeRes(head,preoderList,inoderList);
        return head;
    }


    public static void buildTreeRes(TreeNode head,  LinkedList<Integer> preorder, LinkedList<Integer> inorder) {


             int inorderLen = inorder.size();
             int preorderLen = preorder.size();
             if(inorderLen ==1 || preorderLen==1 ){
                 System.out.printf(" preorder : %d,inorder %d  ",preorderLen,inorderLen);
                 return;
             }
           int rootIndex=inorder.indexOf(head.val);
          LinkedList<Integer> leftInorder=new LinkedList<>();
          LinkedList<Integer> rightInorder=new LinkedList<>();
       for(int index=0;index<inorderLen;index++){
           if(index<rootIndex){
             leftInorder.add(inorder.get(index));
           }else if(index>rootIndex){
             rightInorder.add(inorder.get(index));
           }
       }
       LinkedList<Integer> leftPre = new LinkedList<>();
       LinkedList<Integer> rightPre = new LinkedList<>();
       for(int index=1;index<leftInorder.size()+1;index++){
           leftPre.add(preorder.get(index));
       }
        for(int index=1+leftInorder.size();index<preorderLen;index++){
            rightPre.add(preorder.get(index));
        }

        System.out.println(preorder.size());

        if(leftPre.size()>0){
            TreeNode leftHead =new TreeNode(preorder.get(1));
            head.left=leftHead;

            buildTreeRes(leftHead,leftPre,leftInorder);
        }

        if(rightPre.size()>0){
            TreeNode rightHead = new TreeNode(preorder.get(1+leftInorder.size()));
            head.right=rightHead;
            buildTreeRes(rightHead,rightPre,rightInorder);
        }
    }


    public TreeNode betterbuildTree(int[] P, int[] I) {
        Map<Integer, Integer> M = new HashMap<>();
        for (int i = 0; i < I.length; i++)
            M.put(I[i], i);
        return betterSplitTree(P, M, 0, 0, I.length-1);
    }

    private TreeNode betterSplitTree(int[] P, Map<Integer, Integer> M, int pix, int ileft, int iright) {
        int rval = P[pix], imid = M.get(rval);
        TreeNode root = new TreeNode(rval);
        if (imid > ileft)
            root.left = betterSplitTree(P, M, pix+1, ileft, imid-1);
        if (imid < iright)
            root.right = betterSplitTree(P, M, pix+imid-ileft+1, imid+1, iright);
        return root;
    }



}
