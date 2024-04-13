package med;

public class JumpGame {

    public boolean canJump(int[] nums) {
       int numsLen = nums.length;
       int nowInex = 0;
       int nowStep = nums[0];
       if(numsLen-1 == 0){
           return true;
       }
       if(nowStep == 0){
           return false;
       }
       while(nowInex<numsLen){

           if((nowInex+nums[nowInex])>=numsLen-1){
               return true;
           }else {
               nowStep--;
               int nowIndexStep = nums[nowInex];
               if(nowIndexStep == 0 && nowStep ==0){
                   return false;
               }
               if(nowIndexStep>nowStep){
                   nowStep = nowIndexStep;
               }else {

               }

               nowInex++;
           }


       }
        return false;

    }
}
