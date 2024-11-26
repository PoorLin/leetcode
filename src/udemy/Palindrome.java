package udemy;

public class Palindrome {


    public static boolean isPalindrome(String target){
        int targetLen = target.length();
        int front = 0;
        int end = targetLen-1;


         while (end > front){
             char frontChar = target.charAt(front);
             char endChar = target.charAt(end);
            if( frontChar == endChar){
                front++;
                end--;
            }  else {
                return false;
            }




         }


        return  true;
    }

    public static void main(String[] args) {
        System.out.println( isPalindrome("abccba"));
        System.out.println( isPalindrome("abcdgcba"));
        System.out.println( isPalindrome("abcba"));
    }


}
