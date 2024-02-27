package easy;

public class ValidParentheses {
    public static void main(String[] args) {
    //String a="{]";
    //   String a="[[[[[[[[[[[[[[[[[[[";
    String a="{[]}";
     //  String a="()[]{}";
      //  String a="()";
       // String a="([)]";
        System.out.println(isValid(a));

    }


    // 傳入一個字串 ， 判斷是否為括號 並且要上下要正確對應的
    public static boolean isValid(String s) {
        int sLen=s.length();
        System.out.println(s.length());
return isValidRe(s,0,sLen-1);

    }


   // 發現這種問題使用遞迴較容易
    public static boolean isValidRe(String s,int firstIndex,int finalIndex) {
        int tempFirstIndex = firstIndex;

         if(finalIndex-firstIndex>1){
        if (s.charAt(firstIndex) == '(') {
            while (firstIndex <= finalIndex ) {
                if (s.charAt(firstIndex) == ')') { //迴圈直到找到對應
                    if (tempFirstIndex + 1 == firstIndex) {
                     return isValidRe(s, firstIndex + 1, finalIndex);

                    } else {
                        //探討這個情形
                        return   isValidRe(s, tempFirstIndex + 1, finalIndex) && isValidRe(s, finalIndex + 1, s.length()-1);

                    }


                }else {
                    firstIndex++;
                }
            }

        } else if (s.charAt(firstIndex) == '[') {
            while (firstIndex <= finalIndex ) {
                if (s.charAt(firstIndex) == ']') { //迴圈直到找到對應
                    if (tempFirstIndex + 1 == firstIndex) {
                        return isValidRe(s, firstIndex + 1, finalIndex);

                    } else {
                        return   isValidRe(s, tempFirstIndex + 1, finalIndex) && isValidRe(s, finalIndex + 1, s.length()-1);

                    }


                }  else {
                    firstIndex++;
                }
            }
        } else if (s.charAt(firstIndex) == '{') {
            while (firstIndex <= finalIndex ) {
                if (s.charAt(firstIndex) == '}') { //迴圈直到找到對應
                    if (tempFirstIndex + 1 == firstIndex) {
                        return isValidRe(s, firstIndex + 1, finalIndex);
                    } else {
                        return   isValidRe(s, tempFirstIndex + 1, finalIndex) && isValidRe(s, finalIndex + 1, s.length()-1);
                    }
                }else {
                    firstIndex++;
                }
            }
        }else {
            return false;
        }
    }else if(finalIndex-firstIndex < 1){
             return false;
         }else if(finalIndex-firstIndex ==1){


             //

             if (s.charAt(firstIndex) == '(') {
                 if (s.charAt(finalIndex) == ')') {
                     return true;
                 }else {
                     return false;
                 }
             } else if (s.charAt(firstIndex) == '[') {
                 if (s.charAt(finalIndex) == ']') {
                     return true;
                 }else {
                     return false;
                 }
             } else if (s.charAt(firstIndex) == '{') {
                 if (s.charAt(finalIndex) == '}') {
                     return true;
                 }else {
                     return false;
                 }

             }else {

                 return false;
             }
             //
         }
        return true;










    }



}
