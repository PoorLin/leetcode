package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Stream;

public class AddBinary {

    public static void main(String[] args) {

        System.out.println(addBinary("1010","1011"));

    }

    public static String addBinary(String a, String b) {
    int aLen = a.length();
    int bLen = b.length();
        Stack<String> aStack = new Stack<>();
        Stack<String> bStack = new Stack<>();
      List<Integer> resList = new ArrayList<>();
    StringBuffer stringBuffer=new StringBuffer();
    int addOne=0;
    for(int index=0;index<aLen;index++){
        aStack.push(String.valueOf(a.charAt(index)));
    }
    for(int index=0;index<bLen;index++){
        bStack.push(String.valueOf(b.charAt(index)));
    }

    int tmp = 0;
    if(aLen>bLen){
        for(int index=0;index<aLen;index++){

           if(bLen-1<index){
               int inta = Integer.valueOf(aStack.pop());
               if(inta+tmp>1){
                   resList.add((inta+tmp)%2);
                   tmp=1;
               }else {
                   resList.add(inta+tmp);
                   tmp=0;
               }

           }else {
               int inta = Integer.valueOf(aStack.pop());
               int intb = Integer.valueOf(bStack.pop());
               if(inta+intb+tmp>1){
                   resList.add((inta+tmp+intb)%2);
                   tmp=1;
               }else {
                   resList.add(inta+tmp+intb);
                   tmp=0;
               }
           }
        }
    }else {
        for(int index=0;index<bLen;index++){
            if(aLen-1<index){
                int intb = Integer.valueOf(bStack.pop());
                if(intb+tmp>1){
                    resList.add((intb+tmp)%2);
                    tmp=1;
                }else {
                    resList.add(intb+tmp);
                    tmp=0;
                }

            }else {
                int inta = Integer.valueOf(aStack.pop());
                int intb = Integer.valueOf(bStack.pop());
                if(inta+intb+tmp>1){
                    resList.add((inta+tmp+intb)%2);
                    tmp=1;
                }else {
                    resList.add(inta+tmp+intb);
                    tmp=0;
                }
            }

        }
    }
    if(tmp>0){
        resList.add(1);
    }

    for(int index=resList.size()-1;0<=index;index--){
        stringBuffer.append(resList.get(index));
    }
return stringBuffer.toString();
    }





    public static String addBinaryBetter(String a, String b) {
        StringBuilder result = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0)
                sum += a.charAt(i--) - '0'; // 減一個 '0' 是為了轉為數字
            if (j >= 0)
                sum += b.charAt(j--) - '0';

            result.insert(0, sum % 2);
            carry = sum / 2;
        }

        return result.toString();
    }












}
