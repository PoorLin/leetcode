package easy;

import java.util.*;

public class TwoSum {

    public static void main(String[] args) {
        int[] test = {1,2,3,3} ;
        System.out.println(twoSum(test,6));
    }
    public static int[] twoSum(int[] nums, int target) {

        List<Integer> integerList = new ArrayList<>();
        int numsLen = nums.length;
        int first = 0;
        int sec  = 0;
        for(int index=0;index<numsLen;index++){
            integerList.add(nums[index]);
        }
        for(int index=0;index<numsLen;index++){
            int nowInt=integerList.get(index);
            int minusRe = target-nowInt;
            if(integerList.contains(minusRe)){

                if(target==nowInt*2 && integerList.indexOf(nowInt)==index){
                 continue;
                }else if(target==nowInt*2 && integerList.indexOf(nowInt)!=index){
                    first = integerList.indexOf(nowInt);
                    sec = index;
                }else {
                    first = index;
                    sec = integerList.indexOf(minusRe);
                    break;
                }
            }
        }
        int[] ret={first,sec};
        return ret;
    }

    public static int[] twoSumBetter(int[] nums, int target) {

    int len=nums.length;
        for(int indexOut=0;indexOut<len;indexOut++){
            for(int indexIn=indexOut+1;indexIn<len;indexIn++){
                if(target-nums[indexOut]==nums[indexIn]){
                    return new int[] {indexOut,indexIn};
                }


            }
        }


 return  null;

    }
}
