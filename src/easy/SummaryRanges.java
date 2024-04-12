package easy;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

    // num數字為獨特
    public List<String> summaryRanges(int[] nums) {
   int numLen = nums.length;
   List<String> stringList=new ArrayList<>();
   if(numLen == 0){
        return stringList;
   }
   int start = nums[0];
   int end = nums[0];
   for(int index = 0 ; index<numLen;index++){
      if(nums[index]==end+1 || nums[index]==end){
           end=nums[index];

      }else {
          StringBuffer stringBuffer=new StringBuffer();

          if( start != end){
              stringBuffer.append(start);
              stringBuffer.append("->");
              stringBuffer.append(end);
              stringList.add(stringBuffer.toString());
          }else {
              stringBuffer.append(start);
              stringList.add(stringBuffer.toString());
          }
          start=nums[index];
          end = nums[index];


      }
      if(index == numLen-1){
          StringBuffer stringBuffer=new StringBuffer();
          stringBuffer.append(start);
          if( start != end){
              stringBuffer.append("->");
              stringBuffer.append(end);
          }
          stringList.add(stringBuffer.toString());
      }

   }

return stringList;

    }
}
