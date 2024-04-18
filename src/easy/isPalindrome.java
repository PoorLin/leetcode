package easy;

public class isPalindrome {

    public static boolean isPalindrome(int x) {

        if(x<0){
            return false;
        }



        String xStr =String.valueOf(x);

        for(int index=0,backIndex=xStr.length()-1;index<xStr.length();index++,backIndex-- ){
            if(xStr.charAt(index) !=xStr.charAt(backIndex)){
                return false;
            }



        }

        return true;

    }

}
