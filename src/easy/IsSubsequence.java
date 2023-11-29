package easy;

public class IsSubsequence {
    public static void main(String[] args) {

//        String a="abc";
//        String b="ahbgdc";
        String a="axc";
        String b="ahbgdc";
        System.out.println(isSubsequence(a,b));
    }

    // 傳入兩String ，檢驗是否字串2有沒有包含字串1
    // rule :String 2可以刪除字元，但不能改變順序
    public static boolean isSubsequence(String s, String t) {
    // sol : 1.設定一個區域變數存與字串1相同的次數
        //   2.如果此變數沒有與字串1相同則為false
        //   3.再設定一變數存現在正在比較的字串1
        //   4.針對字串1撰寫for迴圈

        int sameTimes=0;
        for(int tIndex=0;tIndex<t.length();tIndex++){
            if(sameTimes == s.length()){
                break;
            }
            if(t.charAt(tIndex) == s.charAt(sameTimes)){
                sameTimes++;
            }
        }
Boolean isSub=null;
if(sameTimes == s.length()){
    isSub=true;
}else {
    isSub=false;
}
        return isSub;
    }
}
