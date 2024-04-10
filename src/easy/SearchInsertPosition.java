package easy;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
      int numsLen =  nums.length;
      if(nums[0]>=target){
          return 0;
      }
        for(int index=0 ; index<numsLen-1 ; index++){
            if(index+1<=numsLen) {
                if (nums[index] < target && nums[index + 1] >= target) {
                    return index+1;
                }
            }
            if(nums[numsLen-1]<target){
                return numsLen;
            }
        }
      return 1;
    }
}
