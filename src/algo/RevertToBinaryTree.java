package algo;


import java.util.HashMap;
import java.util.Map;

public class RevertToBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 9, 20, 15, 7};
        int[] arr2 = {9, 3, 15, 20, 7};
//        int[] arr1 = {1 , 2};
//        int[] arr2 = {2 , 1};
//        int[] arr1 = {1,2,3};
//        int[] arr2 = {3,2,1};
        RevertToBinaryTree revertToBinaryTree = new RevertToBinaryTree();
        TreeNode treeNode = revertToBinaryTree.buildTree(arr1, arr2);
        System.out.println(treeNode);

    }

    public TreeNode splitTree(int rootIndexInPreorder, int inorderLeftbounde, int inorderRightbound, int[] preorder, int[] inorder, Map<Integer, Integer> inorderMap) {
        // preorder 的leftbounde位置為root


        // 當長度比0小時，回傳null節點, 長度只要>=0 就是有點
        if (inorderRightbound - inorderLeftbounde < 0) {
            return null;
        }
        int rootInt = preorder[rootIndexInPreorder];
        // 在inorder找到 rootInt 的索引
        if (inorderLeftbounde == inorderRightbound) {
            TreeNode node = new TreeNode();
            node.val = inorder[inorderLeftbounde];
            return node;
        }
        // 找到這層子樹的root元素，並透過前次傳入的中序邊界將其分再分為左子樹和右子樹
        int rootIndexAtInOrder = inorderMap.get(rootInt);
        // 優化，通過傳送Map
//        for(int i = 0;i< inorder.length;i++){
//            if(inorder[i] == rootInt){
//                rootIndexAtInOrder = i;
//                break;
//            }
//        }
        int nextInorderLeftChildTreeStart = inorderLeftbounde;
        int nextInorderLeftChildTreeEnd = rootIndexAtInOrder - 1;

        int nextInorderRightChildTreeStart = rootIndexAtInOrder + 1;
        int nextInorderRightChildTreeEnd = inorderRightbound;


        // 可以再用這個索引得到下一層左子樹&&右子樹的開始與結束索引
        // 下層left root從哪邊開始? 上層root +1; right = 上層 + 左子樹數量 +1

        TreeNode leftNode = splitTree(rootIndexInPreorder + 1, nextInorderLeftChildTreeStart, nextInorderLeftChildTreeEnd, preorder, inorder, inorderMap);

        TreeNode rightNode = splitTree(rootIndexInPreorder + nextInorderLeftChildTreeEnd - nextInorderLeftChildTreeStart + 2, nextInorderRightChildTreeStart, nextInorderRightChildTreeEnd, preorder, inorder, inorderMap);
        TreeNode node = new TreeNode();
        node.val = rootInt;
        node.left = leftNode;
        node.right = rightNode;
        return node;
    }


    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length == 0 || inorder.length == 0) {
            return null;
        }
        Map<Integer, Integer> inorderMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }
        TreeNode node = splitTree(0, 0, preorder.length - 1, preorder, inorder, inorderMap);
        return node;
    }


}
