package easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        int[] nums ={1,2,3,1,2,3};

        for(int a=0;a<nums.length;a++){
            System.out.println(set.add(nums[a]));
        }
        System.out.println(set);
    }

// if(i>k) 如果我目前的index大於k， 刪除set當中的index-k-1的元素(也算是說我只存k-1個元素在set中)，因為如果再k-1次內有重複add就跳出迴圈了
        public static boolean containsNearbyDuplicate(int[] nums, int k) {
            Set<Integer> set = new HashSet<Integer>();
            for(int i = 0; i < nums.length; i++){
                if(i > k) set.remove(nums[i-k-1]);
                if(!set.add(nums[i])) return true;
            }
            return false;
        }
        
}
