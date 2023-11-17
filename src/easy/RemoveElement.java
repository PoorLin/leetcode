package easy;

public class RemoveElement {
    public static void main(String[] args) {
     int[] nums = {3,2,2,3};
     int  val = 3;
//     removeElement(nums,val);
//        for (int a:nums
//             ) {
//            System.out.println(a);
//
//        }
        System.out.println(  removeElement(nums,val));
    }

    public static int removeElement(int[] nums, int val) {
        int index=0;
   for(int num=0;num<nums.length;num++){
       if(val != nums[num]){
           nums[index]=nums[num];
           index++;
       }
   }
       return index;

    }


}
