package easy;

public class RemoveElement {
    public static void main(String[] args) {
     int[] nums = {3,2,2,3};
     int  val = 3;
//     removeElement(nums,val);

        System.out.println(  removeElement2(nums,val));
        for (int a:nums
        ) {
            System.out.println(a);

        }
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

    public static int removeElement2(int[] nums, int val) {
        //傳入一個int陣列和int，刪除此陣列的int 並計算刪除後陣列有幾個元素，排序任意
      int counnt=nums.length;
      int valContain=0;
      int[] tmpNums=nums.clone();
for(int a=0;a<nums.length;a++){
    if(nums[a]==val){

    }else {
        nums[valContain++]=tmpNums[a];
    }

}
return valContain;


    }


}
