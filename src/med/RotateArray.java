package med;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        rotate(new int[]{1,2,3,4,5,6,7},3);
    }
    public static void rotate(int[] nums, int k) {
        int numsLen = nums.length;



        if(numsLen<1000) {
            for (int out = 0; out < k; out++) {
                int tmp;
                int after = nums[0];
                for (int index = 0; index < numsLen; index++) {

                    if (index != numsLen - 1) {
                        tmp = nums[index + 1];
                        nums[index + 1] = after;
                        after = tmp;
                    } else {
                        nums[0] = after;
                    }

                }
            }
        }else {

            int[] end=Arrays.copyOfRange(nums,0,k+1);
            int[] front =Arrays.copyOfRange(nums,numsLen-k,numsLen);
            int[] array = new int[numsLen];
       System.arraycopy(front,0,nums,0,k);
            System.arraycopy(end,0,nums,k,numsLen-k);


        }

    }
//         int numsLen = nums.length;
//         int count = 0;
//         int thisNode = nums[0];
//         int lastNode = nums[0];
//         int nowIndex=0;
//         while (count<numsLen){
//             System.out.println(count);
////             if(nowIndex == 0){
////                 tmp=nums[nowIndex+k];
////                 nums[nowIndex+k]=nums[nowIndex];
////                 nowIndex+=k;
////             }
//             if(nowIndex+k>numsLen-1){
//                 thisNode=nums[(nowIndex+k)%numsLen];
//                 nums[(nowIndex+k)%numsLen]=lastNode;
//                 nowIndex = (nowIndex+k)%numsLen;
//                 lastNode=thisNode;
//                 System.out.println(thisNode);
//                 System.out.println(lastNode);
//
//             }else {
//
//                 thisNode=nums[nowIndex+k];
//                 nums[nowIndex+k]=lastNode;
//                 nowIndex+=k;
//                 lastNode=thisNode;
//                 System.out.println(thisNode);
//                 System.out.println(lastNode);
//             }
//
//
//
//             count++;
//
//         }
//
//
//    }
}
