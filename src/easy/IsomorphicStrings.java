package easy;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {


    public static void main(String[] args) {

    }
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> sMap = new HashMap<>();
        Map<Character,Character> tMap = new HashMap<>();
        for(int index = 0; index<s.length();index++){
            char nows = s.charAt(index);
            char nowt = t.charAt(index);
            if(sMap.containsKey(nows) && tMap.containsKey(nowt)){
                char sVal=sMap.get(nows);
                char tVal=tMap.get(nowt);

                if(nowt !=sVal || nows != tVal){
                    return false;
                }
            } else if (sMap.containsKey(nows)) {
                char sVal=sMap.get(nows);
                if(nowt == sVal){
                    tMap.put(nowt,nows);
                }else {
                    return false;
                }



            } else if (tMap.containsKey(nowt)) {
                char tVal = tMap.get(nowt);
                if(nows == tVal){
                    sMap.put(nows,nowt);
                }else {
                    return false;
                }

            }else {
                sMap.put(nows,nowt);
                tMap.put(nowt,nows);
            }


        }

return true;
    }

}
