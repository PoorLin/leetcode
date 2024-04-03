package easy;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {


    public static void main(String[] args) {

wordPattern("aaa","aa aa aa aa");


    }
    public static boolean wordPattern(String pattern, String s) {
        Map<Character,String> map = new HashMap<>();
        Map<String,Character> smap = new HashMap<>();
        String[] strings=s.split(" ");

        int sLen = strings.length;
        int pIndex = pattern.length();
        if(sLen != pIndex){
            return false;
        }
        for(int index = 0 ; index<pIndex;index++){
            char nowChar=pattern.charAt(index);
            String nowStr = strings[index];

            if(map.containsKey(nowChar)){
                if(smap.containsKey(nowStr)){
                    char tmapVal = smap.get(nowStr);
                    String mapVal = map.get(nowChar);
                    if(nowChar != tmapVal){
                        return false;
                    }else if(!mapVal.equals(nowStr)){
                        return false;
                    }
                }else {
                    return false;
                }
            } else if (smap.containsKey(nowStr)) {
               return false;
            }else {
             map.put(nowChar,nowStr);
             smap.put(nowStr,nowChar);
            }
        }
        return true;
    }
}
