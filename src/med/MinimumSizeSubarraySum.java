package med;

import java.util.*;

public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int j=0;
        int min=Integer.MAX_VALUE;
        int sum=0;
        while(j<nums.length){ // 遍歷nums
            sum+=nums[j];
            if(sum>=target){ // 若此次相加比target大執行此迴圈
                while(sum>=target){    //
                    min=Math.min(min,j-i+1);
                    sum-=nums[i];
                    i++;
                }
            }
            j++;
        }
        if(min==Integer.MAX_VALUE)
            return 0;
        else
            return min;
    }
}
