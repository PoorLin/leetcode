package med;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        int numsLen = nums.length;
        if(numsLen ==0){
            return 0;
        }
        Set<Integer> set=new TreeSet<>();

         for(int index= 0;index<numsLen;index++){
           set.add(nums[index]);
         }
         int maxLen = Integer.MIN_VALUE;
         int now = 0 ;
         int nowInt =Integer.MAX_VALUE;
         int nowCount=0;
         int max=set.size();


for(int a:set){
    if(nowInt != a-1){
        nowInt=a;

        maxLen=Math.max(nowCount,maxLen);
        nowCount=1;
    }else {

        nowInt=a;
        nowCount++;

    }

    if(now ==max-1){

        maxLen=Math.max(nowCount,maxLen);
    }
    now++;
}

return maxLen;
    }
}
