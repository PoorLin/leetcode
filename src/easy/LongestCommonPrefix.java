package easy;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {
       //String[] strs = {"flower","flw","flight"};
        String[] strs = {"cir","car"};
        System.out.println(longestCommonPrefix1(strs));
        //longestCommonPrefix1(strs);
    }
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        //
        int strCount=0;
        StringBuffer stringBuffer=new StringBuffer();
       while(strCount<s1.length() && strCount<s2.length()){
           if(s1.charAt(strCount) == s2.charAt(strCount)){
               stringBuffer.append(s1.charAt(strCount));
           }else {
               break;
           }
           strCount++;
       }
return stringBuffer.toString();
    }

















    // 1.給定一個String陣列，從第一個字開始，找出共同字串，若沒有 回傳""
    //  有可能只有一個String
    public static String longestCommonPrefix1(String[] strs) {
        int arrayLength=strs.length;
        int arrayIndex=strs.length-1;
        boolean hasFalse=false;
    StringBuffer stringBuffer=new StringBuffer();
        String firstStr=strs[0];
        if(arrayLength!=1) {
            for (int index = 0; index < firstStr.length(); index++) {
            if(hasFalse){
               break;
            }
                for (int strIndex = 1; strIndex < strs.length; strIndex++) {
                    if (strs[strIndex].length() > index) {
                        if (firstStr.charAt(index) == (strs[strIndex].charAt(index))) {
                            if (arrayIndex == strIndex) {
                                stringBuffer.append(firstStr.charAt(index));
                            }
                        } else {
                            hasFalse=true;
                            break;
                        }
                    } else {
                        break;
                    }
                }

            }
        }else {
            stringBuffer.append(firstStr);
        }

return stringBuffer.toString();

    }

}
