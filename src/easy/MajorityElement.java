package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MajorityElement {

    public static void main(String[] args) {
        //int[] nums1 = {3,2,3};
        int[] nums1 = {3,3,4};
majorityElement(nums1);
    }

    // 輸出int
    // 1.將此intarray輸出一個出現最多次的數字
  public static int majorityElement(int[] intArray){

      Map<Integer,Integer> intArraysCountMap=new HashMap<>();
      for (int eachInt:intArray){
          if(intArraysCountMap.containsKey(eachInt)){
              int eachIntCount=intArraysCountMap.get(eachInt)+1;
              intArraysCountMap.put(eachInt,eachIntCount);
          }else {
              intArraysCountMap.put(eachInt,1);
          }
      }
 //原本想用map的foreach來將value最大的賦值給外部變數，但是在lambda中無法直接賦值，需要AtomicReference ，用這個方法會使程式非常難以閱讀
      Set<Integer> intSet =intArraysCountMap.keySet();
      int mostPopNum=0;
      int nowMostPopNumCount=0;
    for(int nowInt:intSet){


        if(intArraysCountMap.get(nowInt)>nowMostPopNumCount){
            mostPopNum=nowInt;
            nowMostPopNumCount=intArraysCountMap.get(nowInt);
        }

    }
return mostPopNum;
  }

}
