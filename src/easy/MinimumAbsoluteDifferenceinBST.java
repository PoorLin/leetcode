package easy;

import java.util.*;

public class MinimumAbsoluteDifferenceinBST {
    int mnd = 0;
    TreeNode pn;
    public int getMinimumDifference(TreeNode root) {
        //先往最左邊走
       List<Integer> list =new ArrayList<>();

        Map<Integer,Integer> map =new HashMap<>();
        map.put(0,100001);
        getLeft(root,list);
int listLen=list.size();
   for(int test = 0;test<listLen;test++){
       System.out.println(list.get(test));
   }

     for(int index = 0;index<listLen-1;index++){

              int res=Math.abs(list.get(index)-list.get(index+1));
              if(map.get(0)>res){
                  map.put(0,res);
              }
          }
        return map.get(0);
     }



    public static void getLeft(TreeNode root, List<Integer> list){
       if(root.left!=null && root.right!=null){
           getLeft(root.left,list);
           list.add(root.val);
           getLeft(root.right,list);
       }else if(root.left!=null){
           getLeft(root.left,list);
           list.add(root.val);

       }else if(root.right!=null){
           list.add(root.val);
           getLeft(root.right,list);
       }else {
           list.add(root.val);
       }
    }
    public int getMinimumDifferenceBetter(TreeNode root) {
        mnd = Integer.MAX_VALUE;
        pn = null;
        helper(root);
        return mnd;
    }
    private void helper(TreeNode n) {
        if( n == null ) return;
        helper(n.left);
        if( pn != null )
            mnd = Math.min(mnd, Math.abs(pn.val-n.val));
        pn = n;
        helper(n.right);
    }

}
