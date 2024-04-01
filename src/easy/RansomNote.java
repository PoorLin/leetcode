package easy;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {


    public static void main(String[] args) {
        System.out.println(    canConstruct("mkk","mgg"));
        canConstruct("mkk","mgg");


    }

    public static boolean canConstruct(String ransomNote, String magazine) {

        Map<Character,Integer> magMap = new HashMap<>();
        //將mag放進map，並將每個每個字的可使用此數放進value
        for (int a=0; a<magazine.length();a++){
            if(  magMap.containsKey(magazine.charAt(a))){
                int nowCount=magMap.get(magazine.charAt(a));
                magMap.put(magazine.charAt(a),nowCount+1);
            }else {
                    magMap.put(magazine.charAt(a),1);
            }
        }
        boolean isSuccess = true;
        for (int ransomNoteIndex=0; ransomNoteIndex<ransomNote.length();ransomNoteIndex++){
            char nowChar=ransomNote.charAt(ransomNoteIndex);
         if(magMap.containsKey(nowChar) ){
             int count=magMap.get(nowChar);
             if(count == 0 ){
                 return false;
             }else {
                 count-=1;
                 magMap.put(nowChar,count);
             }

         }else {
           return false;
         }


        }



        return isSuccess;
        }


        
    }

