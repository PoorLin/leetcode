package udemy;

import java.util.LinkedList;
import java.util.List;

public class AveragePointer {
    public static void main(String[] args) {
   LinkedList<Integer> test = new LinkedList<>();
    test.add(-11);
        test.add(0);
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(9);
        test.add(14);
        test.add(17);
        test.add(21);
        System.out.println(test);
        LinkedList<Integer> res= average(test,1.5f);
        System.out.println(res);
    }


    public static LinkedList<Integer> average(LinkedList<Integer> sortedArr,float average){
        LinkedList<Integer> res = new LinkedList<>();
        int targetLen=sortedArr.size(); //取得長度
        System.out.println(average);
       int front = 0;  //前指標

       int end = targetLen-1;  //後指標

        while (end > front){  //當後指標要大於前指標才會繼續
            float thisRoundNumber = (float)(sortedArr.get(front)+sortedArr.get(end))/2;
            System.out.println("front:"+sortedArr.get(front)+",end:"+sortedArr.get(end));
            System.out.println("平均數"+thisRoundNumber);
            if(thisRoundNumber>average  ){
                System.out.println(3);
                end--;


            }else if(thisRoundNumber<average){
                System.out.println(4);
                front++;
            }else if(average == thisRoundNumber){
                System.out.println(2);
                res.add((int) thisRoundNumber);
                front++;
                end--;
            }




        }

        return res;
    }

}
