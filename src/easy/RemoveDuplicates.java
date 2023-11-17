package easy;

public class RemoveDuplicates {

    public static void main(String[] args) {
      int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));



    }

    public static int removeDuplicates(int[] nums) {
        int index = 0;
        if (1 == nums.length) {

            return ++index;
        } else {
            for (int num = 0; num < nums.length; num++) {
                if (num + 1 == nums.length) {
                        nums[index++] = nums[num];
                } else {
                    if (nums[num] != nums[num + 1]) {
                        nums[index++] = nums[num];
                    }
                }


            }

            return index;
        }
    }
}
