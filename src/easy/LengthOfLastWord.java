package easy;

public class LengthOfLastWord {
    public static void main(String[] args) {
      // String s = "a   b  c ";
       // String s =  "   fly me   to   the moon  ";
        String s =  "Hello World";

        System.out.println(lengthOfLastWord1(s));
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


    //1.釐清問題 :回傳最後一個字的長度
    //2.具體化規格 (1)只有一個字算是最後一個 (2)甚麼算是最後一個字 ?
    //因為題目沒有具體說明 故先假設只有所有最後一個字都有空白
    //3.解法 設定一個暫存變數經過非空白+1 若為空白並且還有碰到字的時候reset
    public static int lengthOfLastWord1(String s) {
        int sLength=0;
        for(int a=0;a<s.length();a++){
            if(' '==(s.charAt(a)) ){
           if(a+1<s.length()) {
               for (int b = a+1; b < s.length(); b++) {
                   if (' ' != (s.charAt(b))) {
                       sLength = 0;
                   }
                   break;
               }
           }
            }else {
                sLength++;
            }
        }
return sLength;

    }
}
