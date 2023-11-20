package easy;

public class RemoveDuplicates {

    public static void main(String[] args) {
      //int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates2(nums));
        for (int a:nums
             ) {
            System.out.println(a);

        }


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
    public static int removeDuplicates2(int[] nums) {
    int nonRepeated=0;
    int[] tmpNums=nums.clone();

    for (int a=0;a<nums.length;a++) {

        if(a ==  nums.length-1){
            nums[nonRepeated++]=tmpNums[a];
        }else {
            nonRepeated=removeRe(nums, tmpNums, a, nonRepeated);
        }

    }
return nonRepeated;

    }

    public static int removeRe(int[] nums,int[] tmpNums,int a,int nonRepeated) {
        if(tmpNums[a]!=tmpNums[a+1]){
          nums[nonRepeated++]=tmpNums[a];
        }
        return nonRepeated;
    }

    }


