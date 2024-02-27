package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ContainsNearbyDuplicate {
    public static void main(String[] args) {
        int[] ints={1,2,3,1};
        int k=3;
     //   int[] ints={1,0,1,1 };
     //   int k=1;
     //   int[] ints={1,2,3,1,2,3 };
     //   int k=2;
        System.out.println(containsNearbyDuplicate(ints,k));

    }

    // 傳入一個 數字陣列 和一個數字
    // 如果此陣列中有相同的數字，並且只要有一次k>這兩個index相減的絕對值，就是true，反之為false
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int createIndex=0;createIndex<nums.length;createIndex++){
            int nowInt=nums[createIndex];
            if(map.containsKey(nowInt)){
                map.put(nowInt,map.get(nums[createIndex])+1);
            }else {
                map.put(nowInt,1);
            }

        }



        boolean isContain=false;

        int index=0;
        while (index<nums.length-1){
            if(  !map.containsKey(nums[index])){
                continue;
            }
            for (int indexIn=index+1;indexIn<nums.length;indexIn++){
                if(nums[index]==nums[indexIn]) {
                    if (k >= getAbs(index - indexIn)) {
                        System.out.println("k:" + k + "abs:" + getAbs(index - indexIn));
                        isContain = true;
                        break;
                    }
                }
            }
            if(isContain)break;
            index++;
        }

return isContain;
    }



    public static int getAbs(int a){
        if(a>=0){
            return a;
        }else {
            return a*-1;
        }
    }
}
