package med;

import java.util.LinkedList;
import java.util.Stack;

public class EvaluateReversePolishNotation {


    public int evalRPN(String[] tokens) {
           // 陣列中的元素只有數字和 運算元
           // 題目是看起來是要用後序式
           // 不能 /0

        Stack<Integer> stack = new Stack<>();
        for(int index = 0 ;index<tokens.length ; index++ ){
            String nowStr=tokens[index];
            if(nowStr.equals("+")){

                int b = stack.pop();
                int a = stack.pop();
                stack.push(a+b);

            }else if(nowStr.equals("-")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a-b);

            }else if(nowStr.equals("*")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a*b);

            }else if(nowStr.equals("/")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a/b);

            }else {
                stack.push(Integer.valueOf(nowStr));
            }
        }

        return stack.pop();
    }
}
