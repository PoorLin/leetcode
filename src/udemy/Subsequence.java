package udemy;

public class Subsequence {
    public static void main(String[] args) {
        String str1 = "abc";

      //  String str2 = "abxxxc";
      //  String str2 = "cba";
        String str2 = "abccba";

        System.out.println(isSubsequence(str1,str2));

    }




    public static boolean isSubsequence(String str1 ,String str2){

        int nowTar  = 0;
        char nowComparChar = str1.charAt(0);
        int targetStrLen = str1.length();
        int str2Len = str2.length();
        for(int index = 0; index<str2Len;index++){
            char thisChar = str2.charAt(index);
            if(thisChar == nowComparChar ){
                nowTar++;
                if(nowTar == targetStrLen){
                    return true;
                }
                nowComparChar = str1.charAt(nowTar);

            }



        }


        return false;
    }

}
