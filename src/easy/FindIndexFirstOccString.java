package easy;

public class FindIndexFirstOccString {

    public static void main(String[] args) {
//        String str1 = "hello";
//
//        String str2 = "ll";
//        String str1 = "sadbutsad";
//
//        String str2 = "sad";
//        String str1 = "leetcode";
//        String str2 = "leeto";
        String str1 = "abc";
        String str2 = "c";
        System.out.println(strStr(str1,str2));


    }

    // 1.傳入兩個String 如果第二個字串不是第一個字串的一部分的話回傳-1
    public static int strStr(String haystack, String needle) {
         int ans=-1;
        for(int index=0;index<haystack.length();index++){
if(haystack.length()-index<needle.length()){ //所剩字數不夠即退出
    break;
}
            if (verify(index, haystack, needle)) {
        System.out.println("indx" + index);
        ans = index;
        break;
    }

        }

return ans;

    }
    public static boolean verify(int index,String haystack,String needle){
        int noodleIndex=0;
        boolean verify=true;

   while(haystack.length()>index && needle.length()>noodleIndex){

        if(needle.charAt(noodleIndex) == haystack.charAt(index)){

        }else {

            verify=false;
            break;
        }

            index++;
       noodleIndex++;
   }


return verify;
    }


}
