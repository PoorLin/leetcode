package easy;

public class LengthOfLastWord {
    public static void main(String[] args) {
       String s = "a";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
int ans=0;
        Character white=new Character(' ');
        boolean nonWhite=false;
        int lastWhiteCount=0;
    for(int a=s.length()-1;a>=0;a--){
        if( white.equals(s.charAt(a))){
            if(nonWhite) {
                ans = s.length() - a - 1-lastWhiteCount;
                break;
            }
            lastWhiteCount++;
        }else {
            nonWhite=true;
                ans=s.length()-lastWhiteCount;
        }
    }
return ans;
    }
}
