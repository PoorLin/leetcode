package udemy;

import java.util.LinkedList;
import java.util.List;

public class AveragePointer {
    public static void main(String[] args) {


    }


    public LinkedList<Integer> average(LinkedList<Integer> sortedArr,float average){
        LinkedList<Integer> res = new LinkedList<>();
        int targetLen=sortedArr.size(); //取得長度

       int front = 0;  //前指標

       int end = targetLen-1;  //後指標

        while (end > front){  //當後指標要大於前指標才會繼續
            float thisRoundNumber = (sortedArr.get(front)+sortedArr.get(end))/2;

            if(average > thisRoundNumber){
               front++;

            }else if(average < thisRoundNumber){
                end--;
            }else if(average == thisRoundNumber){
                res.add((int) thisRoundNumber);
                front++;
                end--;
            }




        }

        return res;
    }

}
