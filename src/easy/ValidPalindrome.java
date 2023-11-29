package easy;

public class ValidPalindrome {
    public static void main(String[] args) {
//String s1="A man, a plan, a canal: Panama";
        //String s1="race a car";
       // String s1=" ";
        String s1="0P";
        System.out.println(isPalindrome(s1));
    }
    //回文檢測
    //1.刪除所有符號 包含空白，為一新字串
    //2.
    public static boolean isPalindrome(String s) {

        String newStr="";
newStr=s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        System.out.println(newStr);
int newStrLen=newStr.length();
boolean isP=true;
        int exeCutionTime=newStrLen/2;
        int frontIndex=0;
        int backIndex=newStrLen-1;
        while(frontIndex<exeCutionTime){
    System.out.println("nowCompare "+newStr.charAt(frontIndex)+" v.s "+newStr.charAt(backIndex));
if(newStr.charAt(frontIndex)!=newStr.charAt(backIndex) ){
    isP=false;
    break;
}
    frontIndex++;
    backIndex--;
}

    return isP;
    }




}
