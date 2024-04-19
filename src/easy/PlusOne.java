package easy;

import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {

        int plus = 0;
        int digitsLen = digits.length;
        for(int index=digitsLen-1;index>=0;index--){
            if(index == digitsLen-1){
                int sum = digits[index]+1;
                if(sum == 10){
                  digits[index] = 0;
                    plus=1;
                }else {
                digits[index]=sum;
                }

            }else {
                if(plus>0){
                    plus=0;
                    int sum = digits[index]+1;
                    if( sum == 10){
                        digits[index] =0;
                        plus =1;
                    }else {
                        digits[index]=sum;
                    }

                }else {

                }

            }


        }
        if(plus >0){
            int[] newArr =new int[digitsLen+1];
            newArr[0]=1;
            System.arraycopy(digits,0,newArr,1,digitsLen);
            return newArr;
        }


        return digits;
    }


}
