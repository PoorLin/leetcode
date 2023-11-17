package easy;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {
       String[] strs = {"flower","flw","flight"};
        System.out.println(longestCommonPrefix(strs));
        //longestCommonPrefix(strs);
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
}
