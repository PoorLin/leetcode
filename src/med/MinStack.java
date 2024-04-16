package med;

import java.util.ArrayList;
import java.util.Arrays;

public class MinStack {

    int[] intArr;

    public MinStack() {

    }

    public void push(int val) {
        if(intArr==null){
          intArr = new int[]{val};
        }else {
            int len = intArr.length+1;
            int[] newArr =new int[len];
            newArr[0]=val;
            for(int index=1 ; index<len;index++){
                newArr[index]=intArr[index-1];
            }
            intArr = newArr;
        }
    }

    public void pop() {
        if(intArr!=null && intArr.length>0){
            intArr=Arrays.copyOfRange(intArr,1,intArr.length);
        }


    }

    public int top() {
          if(intArr!=null){
              return intArr[0];
          }else {
              return 0;
          }
    }

    public int getMin() {

        int min = Integer.MAX_VALUE;
        for(int a:intArr){
            min=Math.min(a,min);
        }
return min;
    }
}
