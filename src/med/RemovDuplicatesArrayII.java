package med;

public class RemovDuplicatesArrayII {


    public int removeDuplicates(int[] nums) {
        int nowindex=-1;
        int nowInt = -101;
        int numLen = nums.length;
        int count = 0;
        for(int index = 0 ; index<numLen;index++){
            if(nums[index]>nowInt ){  //如果
                count = 0;
                nowInt=nums[index];  //
                nowindex++;
                nums[nowindex]=nums[index];
                count++;
            }else if(nums[index]==nowInt && count<2){
                nowindex++;
                nums[nowindex]=nums[index];
                count++;
            }else {

            }
        }

        return nowindex+1;
    }


}
