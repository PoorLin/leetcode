package easy;

public class ValidParentheses {
    public static void main(String[] args) {
   // String a="{]";
    //   String a="[[[[[[[[[[[[[[[[[[[";
   // String a="{[]}";
      // String a="()[]{}";
      //  String a="()";
       // String a="([)]";
        //String a="(([]){})";
       // String a="{";
 String a="([)";
        System.out.println(isValid(a));


    }


    // 傳入一個字串 ， 判斷是否為括號 並且要上下要正確對應的
    public static boolean isValid(String s) {
        int sLen=s.length();
int index=0;

        while (index<sLen){
            if(sLen==1){
                return false;
            }
            int sameTime=1;
        if(s.charAt(index) == '('){

            for(int searchIndex=index+1;searchIndex<s.length();searchIndex++){
                if(sameTime >1  && searchIndex==s.length()-1){
                    //碰到(
                    return false;
                } else if (sameTime ==1 && s.charAt(searchIndex)!=')' && searchIndex==s.length()-1) {
                    return false;
                } else if (s.charAt(searchIndex) == '(' && searchIndex<s.length()-1) {
                sameTime++;
                } else if (s.charAt(searchIndex) == ')') {
                    //碰到對應時

                    if(sameTime == 1){
                        if(searchIndex==sLen-1){
                            StringBuilder stringBuilder=new StringBuilder();
                            stringBuilder.append(s, index+1, searchIndex);
                            s=stringBuilder.toString();

                            sLen=sLen-2;
                            break;
                        } else if (searchIndex==index+1) {
                            StringBuilder stringBuilder=new StringBuilder();
                            stringBuilder.append(s, searchIndex+1, sLen);
                            s=stringBuilder.toString();
                            sLen=sLen-2;
                            break;
                        } else if (searchIndex!=sLen-1 && (searchIndex-1 <2 || sLen-1-searchIndex<2)) {
                            return false;
                        } else {
                            StringBuilder stringBuilder=new StringBuilder();
                            stringBuilder.append(s, index+1, searchIndex);
                            stringBuilder.append(s,searchIndex+1,sLen);
                            s=stringBuilder.toString();

                            sLen=sLen-2;
                            break;
                        }


                    }else {
                        sameTime--;
                    }
                }
            }
        } else if (s.charAt(index) == '[') {
            for(int searchIndex=index+1;searchIndex<s.length();searchIndex++){
                if(sameTime >1  && searchIndex==s.length()-1){
                    //碰到(
                    return false;
                } else if (sameTime ==1 && s.charAt(searchIndex)!=']' && searchIndex==s.length()-1) {
                    return false;
                } else if (s.charAt(searchIndex) == '[' && searchIndex<s.length()-1) {
                    sameTime++;
                } else if (s.charAt(searchIndex) == ']') {
                    //碰到對應時

                    if(sameTime == 1){
                        if(searchIndex==sLen-1){
                            StringBuilder stringBuilder=new StringBuilder();
                            stringBuilder.append(s, index+1, searchIndex);
                            s=stringBuilder.toString();

                            sLen=sLen-2;
                            break;
                        } else if (searchIndex==index+1) {
                            StringBuilder stringBuilder=new StringBuilder();
                            stringBuilder.append(s, searchIndex+1, sLen);
                            s=stringBuilder.toString();
                            sLen=sLen-2;
                            break;
                        } else if (searchIndex!=sLen-1 && (searchIndex-1 <2 || sLen-1-searchIndex<2)) {
                            return false;
                        } else {
                            StringBuilder stringBuilder=new StringBuilder();
                            stringBuilder.append(s, index+1, searchIndex);
                            stringBuilder.append(s,searchIndex+1,sLen);
                            s=stringBuilder.toString();

                            sLen=sLen-2;
                            break;
                        }


                    }else {
                        sameTime--;
                    }
                }
            }
        } else if (s.charAt(index) == '{') {
            for(int searchIndex=index+1;searchIndex<s.length();searchIndex++){
                if(sameTime >1  && searchIndex==s.length()-1){
                    //碰到(
                    return false;
                } else if (sameTime ==1 && s.charAt(searchIndex)!='}' && searchIndex==s.length()-1) {
                    return false;
                } else if (s.charAt(searchIndex) == '{' && searchIndex<s.length()-1) {
                    sameTime++;
                } else if (s.charAt(searchIndex) == '}') {
                    //碰到對應時

                    if(sameTime == 1){
                        if(searchIndex==sLen-1){
                            StringBuilder stringBuilder=new StringBuilder();
                            stringBuilder.append(s, index+1, searchIndex);
                            s=stringBuilder.toString();

                            sLen=sLen-2;
                            break;
                        } else if (searchIndex==index+1) {
                            StringBuilder stringBuilder=new StringBuilder();
                            stringBuilder.append(s, searchIndex+1, sLen);
                            s=stringBuilder.toString();
                            sLen=sLen-2;
                            break;
                        } else if (searchIndex!=sLen-1 && (searchIndex-1 <2 || sLen-1-searchIndex<2)) {
                            return false;
                        } else {
                            StringBuilder stringBuilder=new StringBuilder();
                            stringBuilder.append(s, index+1, searchIndex);
                            stringBuilder.append(s,searchIndex+1,sLen);
                            s=stringBuilder.toString();

                            sLen=sLen-2;
                            break;
                        }


                    }else {
                        sameTime--;
                    }
                }
            }
        }else {
            return false;
        }


        }
        return true;
    }


   // 發現這種問題或許不用遞迴較容易
//    public static boolean isValidRe(String s,int firstIndex,int finalIndex) {
//        int tempFirstIndex = firstIndex;
//
//         if(finalIndex-firstIndex>1){
//        if (s.charAt(firstIndex) == '(') {
//            while (firstIndex <= finalIndex ) {
//                if (s.charAt(firstIndex) == ')') { //迴圈直到找到對應
//                    //過濾如果為連續
//                    if (tempFirstIndex + 1 == firstIndex) {
//                     return isValidRe(s, firstIndex + 1, finalIndex);
//                    } else {
//                        //若非連續的情況
//                        //1.先過濾裡面只有一個的情況，
//                        if(firstIndex-tempFirstIndex%2==1 || finalIndex-firstIndex%2==1){
//                            return false;
//                        }else {
//                            if(finalIndex==firstIndex){
//                               return isValidRe(s,tempFirstIndex+1,finalIndex-1);
//                            }else {
//                              return   isValidRe(s,tempFirstIndex+1,firstIndex-1) && isValidRe(s,firstIndex+1,finalIndex);
//                            }
//                        }
//                    }
//                }else {
//                    firstIndex++;
//                }
//            }
//        } else if (s.charAt(firstIndex) == '[') {
//            while (firstIndex <= finalIndex ) {
//                if (s.charAt(firstIndex) == ']') { //迴圈直到找到對應
//                    //過濾如果為連續
//                    if (tempFirstIndex + 1 == firstIndex) {
//                        return isValidRe(s, firstIndex + 1, finalIndex);
//                    } else {
//                        //若非連續的情況
//                        //1.先過濾裡面只有一個的情況，
//                        if(firstIndex-tempFirstIndex%2==1 || finalIndex-firstIndex%2==1){
//                            return false;
//                        }else {
//                            if(finalIndex==firstIndex){
//                                return isValidRe(s,tempFirstIndex+1,finalIndex-1);
//                            }else {
//                                return   isValidRe(s,tempFirstIndex+1,firstIndex-1) && isValidRe(s,firstIndex+1,finalIndex);
//                            }
//                        }
//                    }
//                }else {
//                    firstIndex++;
//                }
//            }
//        } else if (s.charAt(firstIndex) == '{') {
//            while (firstIndex <= finalIndex ) {
//                if (s.charAt(firstIndex) == '}') { //迴圈直到找到對應
//                    //過濾如果為連續
//                    if (tempFirstIndex + 1 == firstIndex) {
//                        return isValidRe(s, firstIndex + 1, finalIndex);
//                    } else {
//                        //若非連續的情況
//                        //1.先過濾裡面只有一個的情況，
//                        if(firstIndex-tempFirstIndex%2==1 || finalIndex-firstIndex%2==1){
//                            return false;
//                        }else {
//                            if(finalIndex==firstIndex){
//                                return isValidRe(s,tempFirstIndex+1,finalIndex-1);
//                            }else {
//                                return   isValidRe(s,tempFirstIndex+1,firstIndex-1) && isValidRe(s,firstIndex+1,finalIndex);
//                            }
//                        }
//                    }
//                }else {
//                    firstIndex++;
//                }
//            }
//        }else {
//            return false;
//        }
//    }else if(finalIndex-firstIndex < 1){
//             return false;
//         }else if(finalIndex-firstIndex ==1){
//
//
//             //
//
//             if (s.charAt(firstIndex) == '(') {
//                 if (s.charAt(finalIndex) == ')') {
//                     return true;
//                 }else {
//                     return false;
//                 }
//             } else if (s.charAt(firstIndex) == '[') {
//                 if (s.charAt(finalIndex) == ']') {
//                     return true;
//                 }else {
//                     return false;
//                 }
//             } else if (s.charAt(firstIndex) == '{') {
//                 if (s.charAt(finalIndex) == '}') {
//                     return true;
//                 }else {
//                     return false;
//                 }
//
//             }else {
//
//                 return false;
//             }
//             //
//         }
//        return false;

//    }



}
