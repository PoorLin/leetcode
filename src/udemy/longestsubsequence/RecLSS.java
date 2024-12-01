package udemy.longestsubsequence;

public class RecLSS {
    public static void main(String[] args) {
    String str1 = "ATAACGCGCTGCTCGGGT";
    String str2 = "TCAATCAGGATCCGCTGA";
//        String str1 = "AGB";
//    String str2 = "ACB";
       int res =(getLongestSubsequenceLength(str1,str2));
        System.out.println(res);
    }


    public static int getLongestSubsequenceLength(String str1,String str2){
        int str1Len = str1.length();
        int str2len = str2.length();
        if( str1Len == 0 || str2len == 0){
            return 0;
        }else {
            if(str1.charAt(str1Len-1) == str2.charAt(str2len-1)){
                return 1 + getLongestSubsequenceLength(str1.substring(0,str1Len-1),str2.substring(0,str2len-1));
            }else {
                int deleStr1 = getLongestSubsequenceLength(str1.substring(0,str1Len-1),str2.substring(0,str2len));
                int deleStr2 = getLongestSubsequenceLength(str1.substring(0,str1Len),str2.substring(0,str2len-1));
                return Math.max(deleStr1,deleStr2);
            }
        }

    }

}
