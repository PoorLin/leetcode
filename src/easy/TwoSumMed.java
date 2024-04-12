package easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSumMed {


    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> map= new HashMap<>();
        int pre=0;
        int post=0;
        int numLen = numbers.length;
        for(int index=0;index<numLen;index++){
            map.put(target-numbers[index],index);
        }
        for(int index=0;index<numLen;index++){
            if( map.containsKey(numbers[index])){
                pre = index+1;
                post = map.get(numbers[index])+1;
                break;
            }

        }

return new int[] {pre,post};
    }
}
