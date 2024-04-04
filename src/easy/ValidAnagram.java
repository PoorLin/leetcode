package easy;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static void main(String[] args) {
        System.out.println( isAnagram("anagram","nagaram"));
        isAnagram("anagram","nagaram");

    }

    public static boolean isAnagram(String s, String t) {

        Map<Character,Integer> map = new HashMap<>();


        int sLen=s.length();
        int tLen=t.length();
        if(sLen!=tLen){
            return false;
        }
        for(int index = 0 ; index<sLen ; index++){
            char nowsChar = s.charAt(index);
            char nowtChar = t.charAt(index);
            if(map.containsKey(nowsChar)){

                if(map.containsKey(nowtChar)){
                    map.put(nowtChar, (map.get(nowtChar))-1);
                }else {
                    map.put(nowtChar, -1);
                }
                map.put(nowsChar, (map.get(nowsChar))+1);
            }else if(map.containsKey(nowtChar)){

                map.put(nowsChar,1);
                map.put(nowtChar, (map.get(nowtChar))-1);

            }else {
                if(nowsChar != nowtChar){
                    map.put(nowsChar,1);
                    map.put(nowtChar, -1);
                }

            }
        }

        for(int a: map.values()){
            if(a!=0){
                return false;
            }
        }

return true;
    }



    public static boolean isAnagramBetterWay(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }
        int[] f1=new int[26];
        for(int i=0; i<s.length(); i++){
            f1[s.charAt(i)-97]++;
        }
        for(int i=0; i<t.length(); i++){
            f1[t.charAt(i)-97]--;
        }
        for(int i=0; i<26; i++){
            if(f1[i]!=0){
                return false;
            }
        }
        return true;
    }

}
